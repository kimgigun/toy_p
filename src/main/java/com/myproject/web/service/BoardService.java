package com.myproject.web.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.myproject.web.domain.Board;
import com.myproject.web.domain.BoardInfo;
@Service
public interface BoardService {
	public Map<?,?> selectAllOfArticle(BoardInfo boardInfo)throws Exception;
	public int insertArticle(Board board)throws Exception;
	public int allOfArtCount()throws Exception;
	public Board findArticleInfo(Map<?,?> map)throws Exception;
	public <T> void countArticle(Board board)throws Exception;
	public int updateArticleInfo(Board board)throws Exception;
	public int deleteArticleInfo(Map<?,?>map)throws Exception;
	public int updateCnt(Map<?,?> map)throws Exception;

}
