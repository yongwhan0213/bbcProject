package com.bbc.userInfo.model.dao;

import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.bbc.common.JDBCTemplate.*;
import com.bbc.userInfo.model.vo.UserInfo;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import com.bbc.common.page.vo.PageInfo;

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
	
	public int adminGetBlackListCount(Connection conn) {
		int listCount = 0;
		
		Statement stmt = null;
		ResultSet rset = null;
		String sql = prop.getProperty("adminGetBlackListCount");
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);
			
			if(rset.next()) {
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
	
	public ArrayList<UserInfo> adminBlackSelectList(Connection conn){
		ArrayList<UserInfo> list = new ArrayList<>();
		
		Statement stmt = null;
		ResultSet rset = null;
		String sql = prop.getProperty("adminBlackSelectList");
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				list.add(new UserInfo(rset.getInt("memner_no"),
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
