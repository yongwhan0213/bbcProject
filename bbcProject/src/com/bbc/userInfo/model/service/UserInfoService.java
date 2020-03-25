package com.bbc.userInfo.model.service;

import static com.bbc.common.JDBCTemplate.close;
import static com.bbc.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import com.bbc.common.page.vo.PageInfo;
import com.bbc.userInfo.model.dao.UserInfoDao;
import com.bbc.userInfo.model.vo.UserInfo;

public class UserInfoService{
	// ---------------------------------- 민기 Service
	/**
	 * 1. 등록된 유저수 조회용 서비스
	 * @return	유저 수 리턴
	 */
	public int adminGetListCount() {
		Connection conn = getConnection();
		
		int listCount = new UserInfoDao().adminGetListCount(conn);
		
		close(conn);
		
		return listCount;
	}
	
	/**
	 * 2. 유저 전체 리스트 조회용 서비스
	 * @param pi	페이지 정보 담긴 객체	
	 * @return		유저 리스트가 담긴 객체 리턴
	 */
	public ArrayList<UserInfo> adminSelectList(PageInfo pi){
		Connection conn = getConnection();
		
		ArrayList<UserInfo> list = new UserInfoDao().adminSelectList(conn, pi);
		
		close(conn);
		
		return list;
	}
}
