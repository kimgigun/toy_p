package com.myproject.web.mapper;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.myproject.web.domain.Board;
import com.myproject.web.domain.BoardInfo;
@Repository
public interface BoardMapper {
	public List<?> selectAllOfArticle(BoardInfo boardInfo)throws Exception;
	public int insertArticle(Board board)throws Exception;
	public Board findArticleInfo(Map<?,?> map)throws Exception;
	public <T> void countArticle(Board board)throws Exception;
	public int updateArticleInfo(Board board)throws Exception;
	public int deleteArticleInfo(Map<?,?>map)throws Exception;
	public int allOfArtCount()throws Exception;
	public int updateCnt(Map<?,?> map)throws Exception;

}
