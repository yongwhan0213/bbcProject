package com.bbc.reservation.model.dao;

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

import com.bbc.common.PageInfo;
import com.bbc.payment.model.vo.Payment;
import com.bbc.reservation.model.vo.Reservation;
import com.bbc.userInfo.model.vo.UserInfo;

public class ReservationDao {
	
	Properties prop = new Properties();
	
	public ReservationDao() {
		
		String fileName = ReservationDao.class.getResource("/sql/reservation/reservation-query.properties").getPath();
		
		try {
			prop.load(new FileReader(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Reservation> selectWholeList(Connection conn, PageInfo pi){
		
		ArrayList<Reservation> wholeList = new ArrayList<>();
		
		Statement stmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("wholeList");
		
		try {
			stmt = conn.createStatement();
//			pstmt = conn.prepareStatement(sql);
//			stmt.setInt(1, status);
			
			rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				Reservation r = new Reservation(rset.getInt("member_no"),
												rset.getInt("reservation_no"),
												rset.getDate("rent_date"),
												rset.getDate("return_date"),
												rset.getInt("car_no"),
												rset.getString("member_name"),
												rset.getString("car_name"));
				wholeList.add(r);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		
		return wholeList;
	}
	
	public int getListCount(Connection conn) {
		
		int listCount = 0;
		
		Statement stmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("getListCount");
		
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
	
	
	public int selectCarListRv(Connection conn, int car_no, String rent_date, String return_date) {
		int result = -1;
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		System.out.println(car_no);
		System.out.println(return_date + ":00");
		System.out.println(rent_date + ":00");
		
		String sql = prop.getProperty("selectCarListRv");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, car_no);
			pstmt.setString(2, rent_date + ":00");
			pstmt.setString(3, return_date + ":00");
			rset = pstmt.executeQuery();
			if(rset.next()) {
				result = rset.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return result;
		
	}

	public ArrayList<Reservation> selectRentList(Connection conn, PageInfo pi){
		
		ArrayList<Reservation> rentList = new ArrayList<>();
		
		Statement stmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("rentList");
		
		try {
			stmt = conn.createStatement();
			
			rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				Reservation r = new Reservation(rset.getInt("member_no"),
												rset.getInt("reservation_no"),
												rset.getDate("rent_date"),
												rset.getDate("return_date"),
												rset.getInt("car_no"),
												rset.getString("member_name"),
												rset.getString("car_name"));
				rentList.add(r);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		
		return rentList;
		
	}
	
	public UserInfo selectRentDetailMember(Connection conn, int no) {
		
		UserInfo ui = null;
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("rentDetailMember");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				ui = new UserInfo(rset.getString("member_name"),
									rset.getString("member_zipcode"),
									rset.getString("member_address"),
									rset.getString("rrn"),
									rset.getString("phone"),
									rset.getString("member_email"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return ui;
	}
	
	public Payment selectRentDetailPay(Connection conn, int no) {
		
		Payment p = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("rentDetailPay");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				p = new Payment(rset.getDate("pay_date"),
								rset.getInt("pay_amount"),
								rset.getString("pay_method"),
								rset.getString("refund_statement"),
								rset.getDate("refund_date"),
								rset.getString("car_name"),
								rset.getInt("car_no"),
								rset.getInt("reservation_no"),
								rset.getDate("rent_date"),
								rset.getDate("return_date"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return p;
	}
	
	public ArrayList<Reservation> selectReservClientList(Connection conn, PageInfo pi){
		
		ArrayList<Reservation> list = new ArrayList<>();
		
		Statement stmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("reservClientList");
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				Reservation r = new Reservation(rset.getInt("member_no"),
												rset.getString("member_name"),
												rset.getInt("reservation_no"),
												rset.getString("car_name"),
												rset.getInt("car_no"),
												rset.getDate("rent_date"),
												rset.getDate("return_date"));
				
				list.add(r);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		
		return list;
	}
	
	public UserInfo selectReservDetailMember(Connection conn, int no) {

		UserInfo ui = null;
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("rentDetailMember");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				ui = new UserInfo(rset.getString("member_name"),
									rset.getString("member_zipcode"),
									rset.getString("member_address"),
									rset.getString("rrn"),
									rset.getString("phone"),
									rset.getString("member_email"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return ui;
		
	}
	
	public ArrayList<Payment> selectReservDetailPay(Connection conn, int no) {
		
		ArrayList<Payment> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("rentDetailPay");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Payment p = new Payment(rset.getInt(1),
								rset.getDate("pay_date"),
								rset.getInt("pay_amount"),
								rset.getString("pay_method"),
								rset.getString("refund_statement"),
								rset.getDate("refund_date"),
								rset.getString("car_name"),
								rset.getInt("car_no"),
								rset.getInt("reservation_no"),
								rset.getDate("rent_date"),
								rset.getDate("return_date"));
				
				list.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
	}
}
