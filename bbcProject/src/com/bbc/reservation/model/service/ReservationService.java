package com.bbc.reservation.model.service;

import static com.bbc.common.JDBCTemplate.close;
import static com.bbc.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import com.bbc.common.page.vo.PageInfo;
import com.bbc.payment.model.vo.Payment;
import com.bbc.reservation.model.dao.ReservationDao;
import com.bbc.reservation.model.vo.Reservation;
import com.bbc.userInfo.model.vo.UserInfo;

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

	/**
	 * 3. 대여리스트 조회
	 * @param pi	페이지 객체
	 * @return		대여리스트 객체
	 */
	public ArrayList<Reservation> selectRentList(PageInfo pi){
		
		Connection conn = getConnection();
		
		ArrayList<Reservation> rentList = new ReservationDao().selectRentList(conn, pi);
		
		close(conn);
		
		return rentList;
	}
	
	/**
	 * 4. 대여리스트, 예약회원 상세보기 페이지 회원 정보 조회
	 * @param no	조회하기 위한 해당 회원의 대여 번호
	 * @return		조회된 회원 객체
	 */
	public UserInfo selectRentDetailMember(int no) {
		
		Connection conn = getConnection();
		
		UserInfo ui = new ReservationDao().selectRentDetailMember(conn, no);
		
		close(conn);
		
		return ui;
	}
	
	/**
	 * 5. 대여리스트 상세보기 페이지 차량, 결제 정보 조회
	 * @param no	조회하기 위한 해당 회원의 대여 번호
	 * @return		조회된 차량 정보, 결제 정보 객체
	 */
	public Payment selectRentDetailPay(int no) {
		
		Connection conn = getConnection();
		
		Payment p = new ReservationDao().selectRentDetailPay(conn, no);
		
		close(conn);
		
		return p;
	}
	
	
	/**
	 * 6. 예약 회원 조회 리스트 서비스
	 * @return	예약중인 회원 리스트
	 */
	public ArrayList<Reservation> selectReservClientList(PageInfo pi) {
		
		Connection conn = getConnection();
		
		ArrayList<Reservation> list = new ReservationDao().selectReservClientList(conn, pi);
		
		close(conn);
		
		return list;
	}
	
	/**
	 * 7. 예약 회원 상세의 회원 정보 조회
	 * @param no	예약 회원 번호
	 * @return		회원 정보 객체
	 */
	public UserInfo selectReservDetailMember(String no) {
		
		Connection conn = getConnection();
		
		UserInfo ui = new ReservationDao().selectReservDetailMember(conn, no);
		
		close(conn);
		
		return ui;
	}
	
	public ArrayList<Payment> selectReservDetailPay(String no) {
		
		Connection conn = getConnection();
		
		ArrayList<Payment> list = new ReservationDao().selectReservDetailPay(conn, no);
		
		close(conn);
		
		return list;
	}

	
}
