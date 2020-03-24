package com.bbc.mybranch.model.vo;

// 나의 지점 테이블	.mb
public class MyBranch {

	private int memberNo;	// 회원번호
	private int branchNo;	// 지점번호
	
	public MyBranch() {
		
	}

	public MyBranch(int memberNo, int branchNo) {
		super();
		this.memberNo = memberNo;
		this.branchNo = branchNo;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public int getBranchNo() {
		return branchNo;
	}

	public void setBranchNo(int branchNo) {
		this.branchNo = branchNo;
	}

	@Override
	public String toString() {
		return "MyBranch [memberNo=" + memberNo + ", branchNo=" + branchNo + "]";
	}
	
	 
}
