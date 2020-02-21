package com.myproject.web.domain;

import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
public class Board {
	private String 
	RNUM,
	AREA,
	CITYNAME,
	FOODTYPE,
	BESTMENU,
	SHOPNAME,
	SEARCHINGNAME,
	REASON,
	RES_SEQ,
	REG_DT,
	REG_ID,
	RATING,
	GOOD,
	BAD,
	READ_CNT,
	REG_IP;

	public String getRNUM() {
		return RNUM;
	}

	public void setRNUM(String rNUM) {
		RNUM = rNUM;
	}

	public String getAREA() {
		return AREA;
	}

	public void setAREA(String aREA) {
		AREA = aREA;
	}

	public String getCITYNAME() {
		return CITYNAME;
	}

	public void setCITYNAME(String cITYNAME) {
		CITYNAME = cITYNAME;
	}

	public String getFOODTYPE() {
		return FOODTYPE;
	}

	public void setFOODTYPE(String fOODTYPE) {
		FOODTYPE = fOODTYPE;
	}

	public String getBESTMENU() {
		return BESTMENU;
	}

	public void setBESTMENU(String bESTMENU) {
		BESTMENU = bESTMENU;
	}

	public String getSHOPNAME() {
		return SHOPNAME;
	}

	public void setSHOPNAME(String sHOPNAME) {
		SHOPNAME = sHOPNAME;
	}

	public String getSEARCHINGNAME() {
		return SEARCHINGNAME;
	}

	public void setSEARCHINGNAME(String sEARCHINGNAME) {
		SEARCHINGNAME = sEARCHINGNAME;
	}

	public String getREASON() {
		return REASON;
	}

	public void setREASON(String rEASON) {
		REASON = rEASON;
	}

	public String getRES_SEQ() {
		return RES_SEQ;
	}

	public void setRES_SEQ(String rES_SEQ) {
		RES_SEQ = rES_SEQ;
	}

	public String getREG_DT() {
		return REG_DT;
	}

	public void setREG_DT(String rEG_DT) {
		REG_DT = rEG_DT;
	}

	public String getREG_ID() {
		return REG_ID;
	}

	public void setREG_ID(String rEG_ID) {
		REG_ID = rEG_ID;
	}

	public String getRATING() {
		return RATING;
	}

	public void setRATING(String rATING) {
		RATING = rATING;
	}

	public String getGOOD() {
		return GOOD;
	}

	public void setGOOD(String gOOD) {
		GOOD = gOOD;
	}

	public String getBAD() {
		return BAD;
	}

	public void setBAD(String bAD) {
		BAD = bAD;
	}

	public String getREAD_CNT() {
		return READ_CNT;
	}

	public void setREAD_CNT(String rEAD_CNT) {
		READ_CNT = rEAD_CNT;
	}

	public String getREG_IP() {
		return REG_IP;
	}

	public void setREG_IP(String rEG_IP) {
		REG_IP = rEG_IP;
	}
	
	
}
