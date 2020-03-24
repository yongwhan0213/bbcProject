package com.bbc.area.model.vo;

// 지역 테이블 	.ar
public class Area {

	private String areaCode;	// 지역코드
	private String areaName;	// 지역명
	
	public Area() {
		
	}

	public Area(String areaCode, String areaName) {
		super();
		this.areaCode = areaCode;
		this.areaName = areaName;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	@Override
	public String toString() {
		return "Area [areaCode=" + areaCode + ", areaName=" + areaName + "]";
	}
	
	
	
}
