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
import com.bbc.reservation.model.vo.Reservation;

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
				Reservation r = new Reservation(rset.getInt("reservation_no"),
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

}
