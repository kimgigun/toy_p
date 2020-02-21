package com.myproject.web.domain;

import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
public class Member {
	private String 
	USER_SEQ,
	USER_ID,
	USER_PASSWORD,
	USER_NAME,
	USER_PHONENUM,
	USER_SEX,
	BIRTH_DATE,
	USER_LV,
	USER_ADDR,
	USER_EMAIL,
	REGDATE,
	UPDATEDT;

	public String getUSER_SEQ() {
		return USER_SEQ;
	}

	public void setUSER_SEQ(String uSER_SEQ) {
		USER_SEQ = uSER_SEQ;
	}

	public String getUSER_ID() {
		return USER_ID;
	}

	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}

	public String getUSER_PASSWORD() {
		return USER_PASSWORD;
	}

	public void setUSER_PASSWORD(String uSER_PASSWORD) {
		USER_PASSWORD = uSER_PASSWORD;
	}

	public String getUSER_NAME() {
		return USER_NAME;
	}

	public void setUSER_NAME(String uSER_NAME) {
		USER_NAME = uSER_NAME;
	}

	public String getUSER_PHONENUM() {
		return USER_PHONENUM;
	}

	public void setUSER_PHONENUM(String uSER_PHONENUM) {
		USER_PHONENUM = uSER_PHONENUM;
	}

	public String getUSER_SEX() {
		return USER_SEX;
	}

	public void setUSER_SEX(String uSER_SEX) {
		USER_SEX = uSER_SEX;
	}

	public String getBIRTH_DATE() {
		return BIRTH_DATE;
	}

	public void setBIRTH_DATE(String bIRTH_DATE) {
		BIRTH_DATE = bIRTH_DATE;
	}

	public String getUSER_LV() {
		return USER_LV;
	}

	public void setUSER_LV(String uSER_LV) {
		USER_LV = uSER_LV;
	}

	public String getUSER_ADDR() {
		return USER_ADDR;
	}

	public void setUSER_ADDR(String uSER_ADDR) {
		USER_ADDR = uSER_ADDR;
	}

	public String getUSER_EMAIL() {
		return USER_EMAIL;
	}

	public void setUSER_EMAIL(String uSER_EMAIL) {
		USER_EMAIL = uSER_EMAIL;
	}

	public String getREGDATE() {
		return REGDATE;
	}

	public void setREGDATE(String rEGDATE) {
		REGDATE = rEGDATE;
	}

	public String getUPDATEDT() {
		return UPDATEDT;
	}

	public void setUPDATEDT(String uPDATEDT) {
		UPDATEDT = uPDATEDT;
	} 
	
	
}
