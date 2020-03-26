package com.bbc.carinfo.model.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;

import com.bbc.carinfo.model.dao.CarInfoDao;

import static com.bbc.common.JDBCTemplate.*;

public class CarInfoService {

	public ArrayList<HashMap<String, String>> selectCarTypeRv(int carType, int rent_branch, long dayCount){
		Connection conn = getConnection();
		
		ArrayList<HashMap<String, String>> list = new CarInfoDao().selectCarTypeRv(conn, carType, rent_branch, dayCount);

		
		//HashMap<String, String[]> carList = new CarInfoDao().selectCarLisrRv(conn, carType, rent_branch);
		
		close(conn);
		
		return list;
		
	}
}
