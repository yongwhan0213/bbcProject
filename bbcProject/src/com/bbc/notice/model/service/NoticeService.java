package com.bbc.notice.model.service;

import static com.bbc.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import com.bbc.attachment.model.vo.Attachment;
import com.bbc.common.PageInfo;
import com.bbc.notice.model.dao.NoticeDao;
import com.bbc.notice.model.vo.Notice;

public class NoticeService {
	
	/**
	 * 1. 공지사항 리스트 조회
	 * @param memNo		관리자 번호
	 * @param pi		페이지 객체
	 * @return			조회된 공지사항 리스트 객체
	 */
	public ArrayList<Notice> selectNoticeList(int memNo, PageInfo pi) {
		
		Connection conn = getConnection();
		
		ArrayList<Notice> list = new NoticeDao().selectNoticeList(conn, memNo, pi);
		
		close(conn);
		
		return list;
	}
	
	/**
	 * 2. 공지사항 상세 조회
	 * @param nno		조회하고자 하는 공지사항 번호
	 * @return			조회된 공지사항 객체
	 */
	public Notice selectNotice(int nno) {
		
		Connection conn = getConnection();
		
		Notice nList = null;
		
		// 조회수 증가
		int result = new NoticeDao().increaseCount(conn, nno);
		
		if(result > 0) {
			commit(conn);
			
			// 공지사항 조회
			nList = new NoticeDao().selectNotice(conn, nno);
		} else {
			rollback(conn);
		}
		
		return nList;
	}
	
	/**
	 * 3. 공지사항 한개 삭제
	 * @param nno		삭제할 공지사항 번호
	 * @return			삭제 후 조회되는 행의 개수
	 */
	public int deleteOneNotice(int nno) {
		
		Connection conn = getConnection();
		
		int result = new NoticeDao().deleteOneNotice(conn, nno);
		
		if(result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		
		return result;
	}
	
	/**
	 * 4. 공지사항 등록
	 * @param n			등록할 공지사항 객체
	 * @param list		등록할 첨부파일 객체
	 * @param memNo		로그인한 관리자 번호
	 * @param flag		중요 공지사항 체크여부
	 * @return			공지사항 등록 후 행의 개수
	 */
	public int insertNotice(Notice n, ArrayList<Attachment> list, int memNo) {
		
		Connection conn = getConnection();
		
		int result1 = new NoticeDao().insertNotice(conn, n, memNo);
		int result2 = new NoticeDao().insertAttachment(conn, list);
		
		if(result1 > 0 && result2 > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		
		return result1 * result2;
	}
	
	
	/**
	 * 5. 공지사항 수정용 조회
	 * @param nno	수정할 공지사항 번호
	 * @return		수정할 공지사항 객체
	 */
	public Notice selectUpdateNotice(int nno) {
		
		Connection conn = getConnection();
		
		Notice nList = new NoticeDao().selectNotice(conn, nno);

		close(conn);
		
		return nList;
	}
	
	/**
	 * 6. 공지사항 수정용 서비스
	 * @param n		입력했던 공지사항 객체
	 * @param list	첨부파일 리스트
	 * @param memNo	로그인한 회원 번호
	 * @return		두 실행 결과를 곱한 값
	 */
	public int updateNotice(Notice n, ArrayList<Attachment> list, int memNo) {
		
		Connection conn = getConnection();
		
		int result1 = new NoticeDao().updateNotice(conn, n, memNo);
		int result2 = new NoticeDao().insertAttachment(conn, list);
		
		if(result1 > 0 && result2 > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		
		return result1 * result2;
	}
	
	/**
	 * 7. 첨부파일 조회 서비스
	 * @param nno	해당 파일을 조회할 공지사항 번호
	 * @return		첨부파일 리스트
	 */
	public ArrayList<Attachment> selectAttachment(int nno) {
		
		Connection conn = getConnection();
		
		ArrayList<Attachment> aList = new NoticeDao().selectAttachment(conn, nno);
		
		close(conn);
		
		return aList;
	}
	
	/**
	 * 8. 공지사항 리스트 개수
	 * @return	실행후 행의 값
	 */
	public int getNoticeCount() {
		
		Connection conn = getConnection();
		
		int result = new NoticeDao().getNoticeCount(conn);
		
		close(conn);
		
		return result;
	}
	
	/**
	 * 9. 차랑예약시 지점선택시 선택한 지점의 공지사항 리스트 조회
	 * @param branchNo	조회할 지점 번호
	 * @return			지점의 공지사항 리스트
	 */
	public Notice selectListByBr(int branchNo) {
		
		Connection conn = getConnection();
		
		Notice n = new NoticeDao().selectByBranch(conn, branchNo);
		
		close(conn);
		
		return n;
		
	}

}
