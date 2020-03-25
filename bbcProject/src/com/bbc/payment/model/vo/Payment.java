package com.bbc.payment.model.vo;

import java.sql.Date;

// 결제 테이블	.py
public class Payment {
	
	private int payNo;				// 결제 번호
	private Date payDate;			// 결제 일시
	private int payAmount;			// 결제 금액
	private String payMethod;		// 결제 방식
	private String refundStatus;	// 환불 여부
	private Date refundDate;		// 환불 일시
	
	// -- 추가된 필드
	private int rowNum;
	private String carName;
	private int carNo;
	private int reservationNo;
	private Date rentDate;
	private Date returnDate;
	
	public Payment() {
		
	}
	
	public Payment(int payNo, Date payDate, int payAmount, String payMethod, String refundStatus, Date refundDate) {
		super();
		this.payNo = payNo;
		this.payDate = payDate;
		this.payAmount = payAmount;
		this.payMethod = payMethod;
		this.refundStatus = refundStatus;
		this.refundDate = refundDate;
	}
	
	
	// 대여리스트 상세조회 결제 테이블 조회용 매개변수
	public Payment(Date payDate, int payAmount, String payMethod, String refundStatus, Date refundDate, String carName,
			int carNo, int reservationNo, Date rentDate, Date returnDate) {
		super();
		this.payDate = payDate;
		this.payAmount = payAmount;
		this.payMethod = payMethod;
		this.refundStatus = refundStatus;
		this.refundDate = refundDate;
		this.carName = carName;
		this.carNo = carNo;
		this.reservationNo = reservationNo;
		this.rentDate = rentDate;
		this.returnDate = returnDate;
	}
	
	// 예약회원 상세 결제 조회 매개변수
	public Payment(int rowNum, Date payDate, int payAmount, String payMethod, String refundStatus, Date refundDate, String carName,
			int carNo, int reservationNo, Date rentDate, Date returnDate) {
		super();
		this.rowNum = rowNum;
		this.payDate = payDate;
		this.payAmount = payAmount;
		this.payMethod = payMethod;
		this.refundStatus = refundStatus;
		this.refundDate = refundDate;
		this.carName = carName;
		this.carNo = carNo;
		this.reservationNo = reservationNo;
		this.rentDate = rentDate;
		this.returnDate = returnDate;
	}

	public int getPayNo() {
		return payNo;
	}

	public void setPayNo(int payNo) {
		this.payNo = payNo;
	}

	public Date getPayDate() {
		return payDate;
	}

	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}

	public int getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(int payAmount) {
		this.payAmount = payAmount;
	}

	public String getPayMethod() {
		return payMethod;
	}

	public void setPayMethod(String payMethod) {
		this.payMethod = payMethod;
	}

	public String getRefundStatus() {
		return refundStatus;
	}

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

	public Date getRefundDate() {
		return refundDate;
	}

	public void setRefundDate(Date refundDate) {
		this.refundDate = refundDate;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getCarNo() {
		return carNo;
	}

	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}

	public Date getRentDate() {
		return rentDate;
	}

	public void setRentDate(Date rentDate) {
		this.rentDate = rentDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public int getReservationNo() {
		return reservationNo;
	}

	public void setReservationNo(int reservationNo) {
		this.reservationNo = reservationNo;
	}

	public int getRowNum() {
		return rowNum;
	}

	public void setRowNum(int rowNum) {
		this.rowNum = rowNum;
	}

	@Override
	public String toString() {
		return "Payment [payNo=" + payNo + ", payDate=" + payDate + ", payAmount=" + payAmount + ", payMethod="
				+ payMethod + ", refundStatus=" + refundStatus + ", refundDate=" + refundDate + "]";
	}
	
	
	
	
}
