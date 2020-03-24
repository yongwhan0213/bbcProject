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

	@Override
	public String toString() {
		return "Payment [payNo=" + payNo + ", payDate=" + payDate + ", payAmount=" + payAmount + ", payMethod="
				+ payMethod + ", refundStatus=" + refundStatus + ", refundDate=" + refundDate + "]";
	}
	
	
	
	
}
