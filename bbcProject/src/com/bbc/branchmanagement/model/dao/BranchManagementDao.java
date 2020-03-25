package com.bbc.branchmanagement.model.dao;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.bbc.branchmanagement.model.vo.BranchManagement;
import static com.bbc.common.JDBCTemplate.*;

public class BranchManagementDao {
	private Properties prop = new Properties();
	
	public BranchManagementDao() {
		String fileName = BranchManagementDao.class.getResource("/sql/branchmanagement/branchmanagement-query.properties").getPath(); 
		
		try {
			prop.load(new FileReader(fileName));		
		} catch (IOException e) {	
			e.printStackTrace();
		}		
	}

	public ArrayList<BranchManagement> selectListArea(Connection conn, int areano) {
		
		ArrayList<BranchManagement> list = new ArrayList<>();
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("selectListArea");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, areano);
			rset = pstmt.executeQuery();
			while(rset.next()) {
				list.add(new BranchManagement(rset.getInt("BRANCH_NO"),
						                      rset.getString("BRANCH_NAME"),
						                      "",
						                      ""));
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
