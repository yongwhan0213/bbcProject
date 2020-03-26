package com.bbc.coupon.model.service;

import static com.bbc.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import com.bbc.common.page.vo.PageInfo;
import com.bbc.coupon.model.dao.CouponDao;
import com.bbc.coupon.model.vo.Coupon;

public class CouponService {
	//------------------------- 민기 Service
	/**
	 * 1. 전체 쿠폰 갯수 조회용 서비스
	 * @return	전체 행 갯수 리턴
	 */
	public int adminGetListCount() {
		Connection conn = getConnection();
		
		int listCount = new CouponDao().adminGetListCount(conn);
		
		close(conn);
		
		return listCount;
	}
	
	/**
	 * 2. 쿠폰 리스트 조회용 서비스
	 * @param pi	페이지 정보가 담긴 객체
	 * @return		전체 쿠폰 리스트가 담긴 객체 리턴
	 */
	public ArrayList<Coupon> adminSelectList(PageInfo pi){
		Connection conn = getConnection();
		ArrayList<Coupon> list = new CouponDao().adminSelectList(conn, pi);
		
		close(conn);
		
		return list;
	}
	
	/**
	 * 3. 선택한 쿠폰 삭제용 서비스
	 * @param no	삭제할 쿠폰 번호
	 * @return		처리 결과 리턴
	 */
	public int adminCouponDelete(int no) {
		Connection conn = getConnection();
		
		int result = new CouponDao().adminCouponDelete(conn, no);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		return result;
	}

}
