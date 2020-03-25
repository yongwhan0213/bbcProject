package com.bbc.branchmanagement.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import com.bbc.branchmanagement.model.dao.BranchManagementDao;
import com.bbc.branchmanagement.model.vo.BranchManagement;
import static com.bbc.common.JDBCTemplate.*;

public class BranchManagementService {
	
	public ArrayList<BranchManagement> selectListArea(int areano) {
		
		Connection conn = getConnection();
		
		ArrayList<BranchManagement> list = new BranchManagementDao().selectListArea(conn, areano);
		
		close(conn);
		
		return list;
		
	}

}
