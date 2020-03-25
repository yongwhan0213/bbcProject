package com.bbc.userInfo.model.dao;

import static com.bbc.common.JDBCTemplate.close;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import com.bbc.common.page.vo.PageInfo;
import com.bbc.userInfo.model.vo.UserInfo;

public class UserInfoDao {
	
	private Properties prop = new Properties();
	
	public UserInfoDao() {
		String fileName = UserInfo.class.getResource("/sql/userInfo/userInfo-query.properties").getPath();
		
		try {
			prop.load(new FileReader(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// --------------------------------- 민기 Dao
	public int adminGetListCount(Connection conn) {
		int listCount = 0;
		Statement stmt = null;
		ResultSet rset = null;
		String sql = prop.getProperty("adminGetListCount");
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);
			
			if(rset.next()){
				listCount = rset.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		
		return listCount;
	}
	
	public ArrayList<UserInfo> adminSelectList(Connection conn, PageInfo pi){
		ArrayList<UserInfo> list = new ArrayList<>();
		
		Statement stmt = null;
		ResultSet rset = null;
		String sql = prop.getProperty("adminSelectList");
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				list.add(new UserInfo(rset.getInt("member_no"),
									  rset.getString("member_id"),
									  rset.getString("member_pwd"),
									  rset.getString("member_name"),
									  rset.getString("member_zipcode"),
									  rset.getString("member_address"),
									  rset.getString("phone"),
									  rset.getString("rrn"),
									  rset.getString("member_email"),
									  rset.getString("gender"),
									  rset.getInt("authority_no"),
									  rset.getDate("join_date"),
									  rset.getString("secession")));	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		
		return list;
	}
	
	public int adminBlackUser(Connection conn, int blackNo) {
		int result = 0;
		
		PreparedStatement pstmt = null;
		String sql = prop.getProperty("adminBlackUser");
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, blackNo);
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

}
