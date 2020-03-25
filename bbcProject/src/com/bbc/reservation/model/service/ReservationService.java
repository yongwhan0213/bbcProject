package com.bbc.reservation.model.service;

import static com.bbc.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import com.bbc.common.PageInfo;
import com.bbc.reservation.model.dao.ReservationDao;
import com.bbc.reservation.model.vo.Reservation;

public class ReservationService {
	
	/**
	 * 1. 전체 조회
	 * @param pi	페이지 객체
	 * @return		조회된 전체 회원 예약 정보 객체
	 */
	public ArrayList<Reservation> selectWholeList(PageInfo pi){
		
		Connection conn = getConnection();
		
		ArrayList<Reservation> wholeList = new ReservationDao().selectWholeList(conn, pi);
		
		close(conn);
		
		return wholeList;
		
	}
	
	/**
	 * 2. 대여중인 회원 리스트 개수 조회
	 * @return 결과 행의 수
	 */
	public int getListCount() {
		
		Connection conn = getConnection();
		
		int result = new ReservationDao().getListCount(conn);
		
		close(conn);
		
		return result;
	}
	
	/**
	 * 3. 차량예약 시 선택한 차량의 예약여부 확인
	 * @param	차량등록번호,대여일시,반납일시
	 * @return  예약가능한 차량인경우 0 반환
	 */
	public int selectCarListRv(int car_no, String rent_date, String return_date) {
		Connection conn = getConnection();
		
		int result = new ReservationDao().selectCarListRv(conn, car_no, rent_date, return_date);
		
		close(conn);
		
		return result;
		
	}

}
