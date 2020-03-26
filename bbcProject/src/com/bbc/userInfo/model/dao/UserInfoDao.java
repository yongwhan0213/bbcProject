package com.bbc.userInfo.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import static com.bbc.common.JDBCTemplate.*;
import com.bbc.userInfo.model.vo.UserInfo;

public class UserInfoDao {
	
	private Properties prop = new Properties();
	
	public UserInfoDao() {
		String fileName = UserInfoDao.class.getResource("/sql/member/member-query.properties").getPath();
		
		try {
			prop.load(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public UserInfo loginUserInfo(Connection conn, String memberId, String memberPwd) {
		
		UserInfo loginUser = null;
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("loginUserInfo");
		
		
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberId);
			pstmt.setString(2, memberPwd);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				loginUser = new UserInfo(rset.getInt("MEMBER_NO"),
										 rset.getString("MEMBER_ID"),
										 rset.getString("MEMBER_PWD"),
										 rset.getString("MEMBER_NAME"),
										 rset.getString("MEMBER_ZIPCODE"),
										 rset.getString("MEMBER_ADDRESS"),
										 rset.getString("PHONE"),
										 rset.getString("RRN"),
										 rset.getString("MEMBER_EMAIL"),
										 rset.getString("GENDER"),
										 rset.getInt("AUTHORITY_NO"),
										 rset.getDate("JOIN_DATE"),
										 rset.getString("SECESSION"),
										 rset.getInt("BRANCH_NO"));
			}
			
	
		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return loginUser;
	}
	
	public int insertUser(Connection conn, UserInfo mem) {
		int result = 0;
		
		PreparedStatement pstmt = null;
		
	
		String sql = prop.getProperty("insertUser");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mem.getMemberId());
			pstmt.setString(2, mem.getMemberPwd());
			pstmt.setString(3, mem.getMemberName());
			pstmt.setString(4, mem.getMemberZipcode());
			pstmt.setString(5, mem.getMemberAddress());
			pstmt.setString(6, mem.getPhone());
			pstmt.setString(7, mem.getRrn());
			pstmt.setString(8, mem.getMemberEmail());
			pstmt.setString(9, mem.getGender());
			
			result = pstmt.executeUpdate();
		
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			
		}
		
		return result;
		
	}
	
	public ArrayList<UserInfo> viewMyInfo(Connection conn, int mno){
		
		
		ArrayList<UserInfo> userInfo = new ArrayList<UserInfo>();
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("viewUserInfo");
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, mno);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				userInfo.add(new UserInfo(rset.getString("MEMBER_ID"),
										  rset.getString("MEMBER_NAME"),
										  rset.getString("MEMBER_EMAIL"),
										  rset.getString("PHONE"),
										  rset.getString("MEMBER_ZIPCODE")
										
										));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return userInfo;
		
	}
	
	public UserInfo selectUser(Connection conn, int userNo) {
		UserInfo mem = null;
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("selectUser");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, userNo);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				mem = new UserInfo(rset.getInt("MEMBER_NO"),
						 rset.getString("MEMBER_ID"),
						 rset.getString("MEMBER_PWD"),
						 rset.getString("MEMBER_NAME"),
						 rset.getString("MEMBER_ZIPCODE"),
						 rset.getString("MEMBER_ADDRESS"),
						 rset.getString("PHONE"),
						 rset.getString("RRN"),
						 rset.getString("MEMBER_EMAIL"),
						 rset.getString("GENDER"),
						 rset.getInt("AUTHORITY_NO"),
						 rset.getDate("JOIN_DATE"),
						 rset.getString("SECESSION"),
						 rset.getInt("BRANCH_NO")
						 );
			}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return mem;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
