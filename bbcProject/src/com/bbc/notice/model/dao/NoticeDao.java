package com.bbc.notice.model.dao;

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

import com.bbc.attachment.model.vo.Attachment;
import com.bbc.common.PageInfo;
import com.bbc.notice.model.vo.Notice;

public class NoticeDao {
	
	Properties prop = new Properties();
	
	public NoticeDao() {
		
		String fileName = NoticeDao.class.getResource("/sql/notice/notice-query.properties").getPath();
		
		try {
			prop.load(new FileReader(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Notice> selectNoticeList(Connection conn, int memNo, PageInfo pi) {
		
		ArrayList<Notice> list = new ArrayList<>();
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("noticeList");
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			int startRow = (pi.getCurrentPage() - 1) * pi.getTableLimit() + 1;
			int endRow = startRow + pi.getTableLimit() - 1;
			
			pstmt.setInt(1, memNo);
			pstmt.setInt(2, startRow);
			pstmt.setInt(3, endRow);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				list.add(new Notice(rset.getInt(1),
									rset.getInt("notice_no"),
									rset.getString("notice_title"),
									rset.getString("member_name"),
									rset.getDate("notice_date"),
									rset.getInt("notice_readcnt")));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
	}
	
	public int increaseCount(Connection conn, int nno) {
		
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		String sql = prop.getProperty("increaseCount");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, nno);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}
	
	public Notice selectNotice(Connection conn, int nno) {
		
		Notice nList = null;
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("selectNotice");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, nno);
			pstmt.setInt(2, nno);
			pstmt.setInt(3, nno);
			
			rset = pstmt.executeQuery();

			if(rset.next()) {
				nList = new Notice(rset.getInt("notice_no"),
									rset.getString("notice_title"),
									rset.getString("notice_content"),
									rset.getDate("notice_date"),
									rset.getDate("notice_modify_date"),
									rset.getInt("notice_readcnt"),
									rset.getInt("member_no"),
									rset.getInt("notice_import"),
									rset.getInt("notice_field"),
									rset.getInt("branch_no"),
									rset.getInt("prev"),
									rset.getInt("next"));
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return nList;
	}
	
	public int deleteOneNotice(Connection conn, int nno) {
		
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		String sql = prop.getProperty("deleteNoticeOne");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, nno);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}
	
	public int insertNotice(Connection conn, Notice n, int memNo) {
		
		int result = 0;
		PreparedStatement pstmt = null;
		String sql = prop.getProperty("insertNotice");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, n.getNoticeTitle());
			pstmt.setString(2, n.getNoticeContent());
			pstmt.setInt(3, memNo);
			pstmt.setInt(4, n.getNoticeImport());
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}
	
	public int insertAttachment(Connection conn, ArrayList<Attachment> list) {
		
		int result = 1;
		PreparedStatement pstmt = null;
		String sql = prop.getProperty("insertAttachment");
		
		
		try {
			for(int i=0; i<list.size(); i++) {
				pstmt = conn.prepareStatement(sql);
				
				Attachment at = list.get(i);
				pstmt.setString(1, at.getFileName());
				pstmt.setString(2, at.getRename());
				pstmt.setString(3, at.getFilePath());
				
				result = pstmt.executeUpdate();
				
				if(result == 0) {
					return 0;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
		
	}
	
	public int updateNotice(Connection conn, Notice n, int memNo) {
		
		int result = 0;
		PreparedStatement pstmt = null;
		
		String sql = prop.getProperty("updateNotice");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, n.getNoticeTitle());
			pstmt.setString(2, n.getNoticeContent());
			pstmt.setInt(3, n.getNoticeImport());
			pstmt.setInt(4, n.getNoticeNo());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}
	
	public ArrayList<Attachment> selectAttachment(Connection conn, int nno){
		
		ArrayList<Attachment> aList = new ArrayList<>();
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String sql = prop.getProperty("selectAttachment");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, nno);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Attachment at = new Attachment();
				at.setFileNo(rset.getInt("file_no"));
				at.setFileName(rset.getString("file_name"));
				at.setRename(rset.getString("frename"));
				
				aList.add(at);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return aList;
	}
	
	public int getNoticeCount(Connection conn) {
		
		int eventCount = 0;
		
		Statement stmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("getNoticeCount");
		
		try {
			stmt = conn.createStatement();
			
			rset = stmt.executeQuery(sql);
			
			if(rset.next()) {
				eventCount = rset.getInt(1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(stmt);
		}
		
		return eventCount;
	}
	
	public Notice selectByBranch(Connection conn, int branchNo) {

		Notice n = null;
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("selectByBranch");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, branchNo);
			rset = pstmt.executeQuery();
			if(rset.next()) {	
				n = new Notice(rset.getString("NOTICE_TITLE"),
						       rset.getString("NOTICE_CONTENT"));
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
				
		return n;
		
	}
	
//	String no = "123";
//	arry = no.split(",");
//	for(i=0; i< array.length; i++) {
//		int result = new ReservationDao().selectReservDetailPay(conn, array[i]);
//	}
}
