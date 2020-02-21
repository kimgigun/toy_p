package com.myproject.web.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class BoardInfo {
	private int 
	firstRow,
	lastRow,
	firstPage,
	lastPage,
	pageCnt,
	currPage,
	listCntOfOnePage, 
	numOfpageTerm;
 
	public int getFirstRow() {
		return firstRow;
	}

	public void setFirstRow(int firstRow) {
		this.firstRow = firstRow;
	}

	public int getLastRow() {
		return lastRow;
	}

	public void setLastRow(int lastRow) {
		this.lastRow = lastRow;
	}

	public int getFirstPage() {
		return firstPage;
	}

	public void setFirstPage(int firstPage) {
		this.firstPage = firstPage;
	}

	public int getLastPage() {
		return lastPage;
	}

	public void setLastPage(int lastPage) {
		this.lastPage = lastPage;
	}

	public int getPageCnt() {
		return pageCnt;
	}

	public void setPageCnt(int pageCnt) {
		this.pageCnt = pageCnt;
	}

	public int getCurrPage() {
		return currPage;
	}

	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}

	public int getListCntOfOnePage() {
		return listCntOfOnePage;
	}

	public void setListCntOfOnePage(int listCntOfOnePage) {
		this.listCntOfOnePage = listCntOfOnePage;
	}

	public int getNumOfpageTerm() {
		return numOfpageTerm;
	}

	public void setNumOfpageTerm(int numOfpageTerm) {
		this.numOfpageTerm = numOfpageTerm;
	}
	
}
