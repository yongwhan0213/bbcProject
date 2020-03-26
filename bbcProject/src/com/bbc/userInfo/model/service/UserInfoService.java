package com.bbc.userInfo.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import static com.bbc.common.JDBCTemplate.*;
import com.bbc.userInfo.model.dao.UserInfoDao;
import com.bbc.userInfo.model.vo.UserInfo;

public class UserInfoService{

	//로그인
	public UserInfo loginUserInfo(String memberId, String memberPwd) {
		
		Connection conn = getConnection();
		
		UserInfo loginUser = new UserInfoDao().loginUserInfo(conn, memberId, memberPwd);
		
		close(conn);
		
		return loginUser;
	}
	
	//회원가입용
	public int insertUser(UserInfo mem) {
		
		Connection conn = getConnection();
		
		int result = new UserInfoDao().insertUser(conn,mem);
		
		if (result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	}
	
	//회원정보 조회용 
	  public ArrayList<UserInfo> viewMyInfo(int mno) {
		  
		  Connection conn = getConnection();
		  
		  ArrayList<UserInfo> info = new UserInfoDao().viewMyInfo(conn, mno);
		 
		  close(conn);
		
		return info;
		  
	  }
	  
	  public UserInfo selectUser(int userNo) {
		  Connection conn = getConnection();
		  
		  UserInfo mem = new UserInfoDao().selectUser(conn,userNo);
		  
		  close(conn);
		  
		  return mem;
	  }
	
}
