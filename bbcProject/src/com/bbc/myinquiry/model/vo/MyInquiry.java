package com.bbc.myinquiry.model.vo;

import java.sql.Date;

// 나의 문의내역 테이블		.mi
public class MyInquiry {

	private int inquiryNo;			// 문의 번호
	private String inquiryTitle;	// 제목
	private String inquiryContent;	// 내용
	private Date inquiryDate;		// 작성일자
	private Date inquiryModifyDate;	// 수정일자
	private String inquiryAnswer;	// 답변
	private String inquiryStatus;	// 답변 처리 상태
	private Date inquiryAnswerDate;	// 답변 작성 날짜
	private int memberNo;			// 회원 번호
	
	public MyInquiry() {
		
	}
	
	public MyInquiry(int inquiryNo, String inquiryTitle, String inquiryContent, Date inquiryDate,
			Date inquiryModifyDate, String inquiryAnswer, String inquiryStatus, Date inquiryAnswerDate, int memberNo) {
		super();
		this.inquiryNo = inquiryNo;
		this.inquiryTitle = inquiryTitle;
		this.inquiryContent = inquiryContent;
		this.inquiryDate = inquiryDate;
		this.inquiryModifyDate = inquiryModifyDate;
		this.inquiryAnswer = inquiryAnswer;
		this.inquiryStatus = inquiryStatus;
		this.inquiryAnswerDate = inquiryAnswerDate;
		this.memberNo = memberNo;
	}

	public int getInquiryNo() {
		return inquiryNo;
	}

	public void setInquiryNo(int inquiryNo) {
		this.inquiryNo = inquiryNo;
	}

	public String getInquiryTitle() {
		return inquiryTitle;
	}

	public void setInquiryTitle(String inquiryTitle) {
		this.inquiryTitle = inquiryTitle;
	}

	public String getInquiryContent() {
		return inquiryContent;
	}

	public void setInquiryContent(String inquiryContent) {
		this.inquiryContent = inquiryContent;
	}

	public Date getInquiryDate() {
		return inquiryDate;
	}

	public void setInquiryDate(Date inquiryDate) {
		this.inquiryDate = inquiryDate;
	}

	public Date getInquiryModifyDate() {
		return inquiryModifyDate;
	}

	public void setInquiryModifyDate(Date inquiryModifyDate) {
		this.inquiryModifyDate = inquiryModifyDate;
	}

	public String getInquiryAnswer() {
		return inquiryAnswer;
	}

	public void setInquiryAnswer(String inquiryAnswer) {
		this.inquiryAnswer = inquiryAnswer;
	}

	public String getInquiryStatus() {
		return inquiryStatus;
	}

	public void setInquiryStatus(String inquiryStatus) {
		this.inquiryStatus = inquiryStatus;
	}

	public Date getInquiryAnswerDate() {
		return inquiryAnswerDate;
	}

	public void setInquiryAnswerDate(Date inquiryAnswerDate) {
		this.inquiryAnswerDate = inquiryAnswerDate;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	@Override
	public String toString() {
		return "MyInquiry [inquiryNo=" + inquiryNo + ", inquiryTitle=" + inquiryTitle + ", inquiryContent="
				+ inquiryContent + ", inquiryDate=" + inquiryDate + ", inquiryModifyDate=" + inquiryModifyDate
				+ ", inquiryAnswer=" + inquiryAnswer + ", inquiryStatus=" + inquiryStatus + ", inquiryAnswerDate="
				+ inquiryAnswerDate + ", memberNo=" + memberNo + "]";
	}
	
	
	
	
}
