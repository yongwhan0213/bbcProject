package com.bbc.coupon.model.vo;

import java.sql.Date;

// 쿠폰 테이블	.co
public class Coupon {

	private int couponNo;			// 쿠폰 번호
	private String couponName;		// 쿠폰명
	private String couponType;		// 쿠폰종류
	private Date couponPost;		// 등록일
	private Date couponExp;			// 만료일
	private String couponCondition;	// 사용 조건
	private int couponDc;			// 할인금액
	private int memberNo;			// 회원 번호
	
	public Coupon() {
		
	}

	public Coupon(int couponNo, String couponName, String couponType, Date couponPost, Date couponExp,
			String couponCondition, int couponDc, int memberNo) {
		super();
		this.couponNo = couponNo;
		this.couponName = couponName;
		this.couponType = couponType;
		this.couponPost = couponPost;
		this.couponExp = couponExp;
		this.couponCondition = couponCondition;
		this.couponDc = couponDc;
		this.memberNo = memberNo;
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

	public String getCouponType() {
		return couponType;
	}

	public void setCouponType(String couponType) {
		this.couponType = couponType;
	}

	public Date getCouponPost() {
		return couponPost;
	}

	public void setCouponPost(Date couponPost) {
		this.couponPost = couponPost;
	}

	public Date getCouponExp() {
		return couponExp;
	}

	public void setCouponExp(Date couponExp) {
		this.couponExp = couponExp;
	}

	public String getCouponCondition() {
		return couponCondition;
	}

	public void setCouponCondition(String couponCondition) {
		this.couponCondition = couponCondition;
	}

	public int getCouponDc() {
		return couponDc;
	}

	public void setCouponDc(int couponDc) {
		this.couponDc = couponDc;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	@Override
	public String toString() {
		return "Coupon [couponNo=" + couponNo + ", couponName=" + couponName + ", couponType=" + couponType
				+ ", couponPost=" + couponPost + ", couponExp=" + couponExp + ", couponCondition=" + couponCondition
				+ ", couponDc=" + couponDc + ", memberNo=" + memberNo + "]";
	}
	
	
}
