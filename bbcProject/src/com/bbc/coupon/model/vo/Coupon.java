package com.bbc.coupon.model.vo;

import java.sql.Date;

// 쿠폰 테이블	.co
public class Coupon {

	private int couponNo;			// 쿠폰 번호
	private String couponName;		// 쿠폰명
	private Date couponEnrollDate;	// 발급일(회원이 발급받은 날짜)
	private Date couponEndDate;		// 만료일(회원마다 다름)
	private int couponDc;			// 할인금액
	private int couponGive;			// 발급조건(1:회원가입, 2:첫이용후, 3:3번이용시)
	private String couponUse;		// 사용여부(사용, 미사용)
	private int memberNo;			// 회원 번호
	// ----------------- 추가된 변수
	private String memberName;		// 회원 이름
	
	public Coupon() {
		
	}

	public Coupon(int couponNo, String couponName, Date couponEnrollDate, Date couponEndDate, int couponDc,
			int couponGive, String couponUse, int memberNo) {
		super();
		this.couponNo = couponNo;
		this.couponName = couponName;
		this.couponEnrollDate = couponEnrollDate;
		this.couponEndDate = couponEndDate;
		this.couponDc = couponDc;
		this.couponGive = couponGive;
		this.couponUse = couponUse;
		this.memberNo = memberNo;
	}
	
	// 쿠폰 리스트 조회용 매개변수
	public Coupon(int couponNo, String couponName, Date couponEnrollDate, Date couponEndDate, int couponDc, String couponUse,
			int couponGive, String memberName) {
		super();
		this.couponNo = couponNo;
		this.couponName = couponName;
		this.couponEnrollDate = couponEnrollDate;
		this.couponEndDate = couponEndDate;
		this.couponDc = couponDc;
		this.couponUse = couponUse;
		this.couponGive = couponGive;
		this.memberName = memberName;
	}

	public int getCouponNo() {
		return couponNo;
	}

	public void setCouponNo(int couponNo) {
		this.couponNo = couponNo;
	}

	public String getCouponName() {
		return couponName;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public Date getCouponEnrollDate() {
		return couponEnrollDate;
	}

	public void setCouponEnrollDate(Date couponEnrollDate) {
		this.couponEnrollDate = couponEnrollDate;
	}

	public Date getCouponEndDate() {
		return couponEndDate;
	}

	public void setCouponEndDate(Date couponEndDate) {
		this.couponEndDate = couponEndDate;
	}

	public int getCouponDc() {
		return couponDc;
	}

	public void setCouponDc(int couponDc) {
		this.couponDc = couponDc;
	}

	public int getCouponGive() {
		return couponGive;
	}

	public void setCouponGive(int couponGive) {
		this.couponGive = couponGive;
	}

	public String getCouponUse() {
		return couponUse;
	}

	public void setCouponUse(String couponUse) {
		this.couponUse = couponUse;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "Coupon [couponNo=" + couponNo + ", couponName=" + couponName + ", couponEnrollDate=" + couponEnrollDate
				+ ", couponEndDate=" + couponEndDate + ", couponDc=" + couponDc + ", couponGive=" + couponGive
				+ ", couponUse=" + couponUse + ", memberNo=" + memberNo + "]";
	}
	
}
