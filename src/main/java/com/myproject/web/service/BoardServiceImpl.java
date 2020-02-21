package com.myproject.web.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.web.domain.Board;
import com.myproject.web.domain.BoardInfo;
import com.myproject.web.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	BoardMapper mapper;

	@Override
	public Map<?,?> selectAllOfArticle(BoardInfo boardInfo) throws Exception {
		int firstRow, lastRow, firstPage, lastPage, pageCnt, currPage , listCntOfOnePage = 0,numOfpageTerm = 10;
		int articleCnt = allOfArtCount();
		if(boardInfo.getListCntOfOnePage() == 0 ){
			listCntOfOnePage = 10;
		}else{
			listCntOfOnePage = boardInfo.getListCntOfOnePage();
		}
		if(boardInfo.getCurrPage() == 0){
			currPage = 1;
		}else{
			currPage = boardInfo.getCurrPage();
		}
		pageCnt = articleCnt/listCntOfOnePage == 0? articleCnt / listCntOfOnePage : articleCnt / listCntOfOnePage+1;
		firstRow = currPage == 1 ? 1 : currPage * 10 + 1;
		lastRow = firstRow + 9;
		firstPage = currPage - (currPage % listCntOfOnePage == 0? 10 : currPage % listCntOfOnePage) + 1;
		lastPage = firstPage + numOfpageTerm - 1;
		
		boardInfo.setCurrPage(currPage);
		boardInfo.setFirstPage(firstPage);
		boardInfo.setLastPage(lastPage);
		boardInfo.setFirstRow(firstRow);
		boardInfo.setLastRow(lastRow);
		boardInfo.setListCntOfOnePage(listCntOfOnePage);
		boardInfo.setNumOfpageTerm(numOfpageTerm);
		boardInfo.setPageCnt(pageCnt);
		List<?> boardList =  mapper.selectAllOfArticle(boardInfo);
		List<BoardInfo> InfoList = new ArrayList<>();
		InfoList.add(boardInfo);		
		Map<String,Object> resultMap = new HashMap<>(); 
		resultMap.put("boardInfo", InfoList);
		resultMap.put("boardList", boardList);
		return resultMap;
	}

	@Override
	public int insertArticle(Board board) throws Exception  {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Board findArticleInfo(Map<?, ?> map) throws Exception {
		Board board = mapper.findArticleInfo(map);
		return board;
	}

	@Override
	public <T> void countArticle(Board board) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int updateArticleInfo(Board board) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteArticleInfo(Map<?, ?> map) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public int allOfArtCount() throws Exception {
		return mapper.allOfArtCount();
	}

	@Override
	public int updateCnt(Map<?, ?> map) throws Exception {
		return mapper.updateCnt(map);
	}




}
