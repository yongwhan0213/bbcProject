package com.bbc.branchmanagement.model.vo;

// 지점 관리 테이블	.br
public class BranchManagement {
	
	private int branchNo;			// 지점 번호
	private String branchName;		// 지점명
	private String branchPhone;		// 전화번호
	private String branchZipcode;	// 우편 번호
	private String branchAddress;	// 상세 주소
	private String branchHrs;		// 영업시간
	private String branchDir;		// 교통 안내
	private String areaCode;		// 지역 코드
	private int memberNo;			// 회원 번호
	
	public BranchManagement() {
		
	}
	
	public BranchManagement(int branchNo, String branchName, String branchPhone, String branchZipcode,
			String branchAddress, String branchHrs, String branchDir, String areaCode, int memberNo) {
		super();
		this.branchNo = branchNo;
		this.branchName = branchName;
		this.branchPhone = branchPhone;
		this.branchZipcode = branchZipcode;
		this.branchAddress = branchAddress;
		this.branchHrs = branchHrs;
		this.branchDir = branchDir;
		this.areaCode = areaCode;
		this.memberNo = memberNo;
	}

	public int getBranchNo() {
		return branchNo;
	}

	public void setBranchNo(int branchNo) {
		this.branchNo = branchNo;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchPhone() {
		return branchPhone;
	}

	public void setBranchPhone(String branchPhone) {
		this.branchPhone = branchPhone;
	}

	public String getBranchZipcode() {
		return branchZipcode;
	}

	public void setBranchZipcode(String branchZipcode) {
		this.branchZipcode = branchZipcode;
	}

	public String getBranchAddress() {
		return branchAddress;
	}

	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}

	public String getBranchHrs() {
		return branchHrs;
	}

	public void setBranchHrs(String branchHrs) {
		this.branchHrs = branchHrs;
	}

	public String getBranchDir() {
		return branchDir;
	}

	public void setBranchDir(String branchDir) {
		this.branchDir = branchDir;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	@Override
	public String toString() {
		return "BranchManagement [branchNo=" + branchNo + ", branchName=" + branchName + ", branchPhone=" + branchPhone
				+ ", branchZipcode=" + branchZipcode + ", branchAddress=" + branchAddress + ", branchHrs=" + branchHrs
				+ ", branchDir=" + branchDir + ", areaCode=" + areaCode + ", memberNo=" + memberNo + "]";
	}
	

}
