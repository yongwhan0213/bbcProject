package com.bbc.carinfo.model.dao;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;

import static com.bbc.common.JDBCTemplate.*;

public class CarInfoDao {
	private Properties prop = new Properties();
	
	public CarInfoDao() {
		String fileName = CarInfoDao.class.getResource("/sql/cartype/cartype-query.properties").getPath();
		
		try {
			prop.load(new FileReader(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<HashMap<String, String>> selectCarTypeRv(Connection conn, int carType, int rent_branch){
		
		ArrayList<HashMap<String, String>> list = new ArrayList<>();
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("selectCarTypeRv");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, carType);
			pstmt.setInt(2, rent_branch);
			rset = pstmt.executeQuery();
			while(rset.next()) {
				HashMap<String,String> hashMap = new HashMap<>();
				
 	            hashMap.put("CAR_TYPE_NO",String.valueOf(rset.getInt("CAR_TYPE_NO")));
 	            hashMap.put("CAR_NO",String.valueOf(rset.getInt("CAR_NO")));
 	            hashMap.put("CAR_TYPE_NAME", rset.getString("CAR_TYPE_NAME"));
 	            hashMap.put("CAR_MODIFY_NAME", rset.getString("CAR_MODIFY_NAME"));
 	            hashMap.put("CAR_FUEL", rset.getString("CAR_FUEL"));
 	            hashMap.put("CAR_RIDE_PEOPLE",String.valueOf(rset.getInt("CAR_RIDE_PEOPLE")));
 	            hashMap.put("RENT_1D",String.valueOf(rset.getInt("RENT_1D")));
 	            hashMap.put("RENT_1D_6D",String.valueOf(rset.getInt("RENT_1D_6D")));
 	            hashMap.put("RENT_7DP",String.valueOf(rset.getInt("RENT_7DP")));
 	            hashMap.put("MEMBER_CAR",String.valueOf(rset.getInt("MEMBER_CAR")));
 	            
 			    list.add(hashMap);
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
