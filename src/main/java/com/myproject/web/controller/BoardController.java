package com.myproject.web.controller;


import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.myproject.web.domain.Board;
import com.myproject.web.domain.BoardInfo;
import com.myproject.web.service.BoardService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	private ModelAndView mav;
	
	@Autowired 
	BoardService Boardserivce;
	
	
	
	
	@RequestMapping(value = "/moveBoard/list", method = RequestMethod.GET)
	 public String board() throws Exception {
		System.out.println("hello");
		System.out.println("dd");
		
		return "/board/resBoard";
	}
	
	@RequestMapping(value = "/board/detail", method = RequestMethod.GET)
	public String boardDetail(@RequestParam int pageNum, Model model) throws Exception {
		Map<String,Object> map = new HashMap<>();
		if((Integer)pageNum != null){
			map.put("pageNum",pageNum);
			Board board = Boardserivce.findArticleInfo(map);
			model.addAttribute("board", board);
		}
		return "/board/detail";
	}
	
	@RequestMapping(value = "/getBoard/list", method = RequestMethod.POST)
	 public @ResponseBody Map<?,?> getBoardList(@RequestBody BoardInfo boardInfo) throws Exception {
		Map<?,?> result = Boardserivce.selectAllOfArticle(boardInfo);
		return result;
	}
	
	
	@RequestMapping(value = "/getAllOfArticle", method = RequestMethod.POST)  
	public ModelAndView getCheck(@RequestParam int articleNum)throws Exception {
		ModelAndView mav = new ModelAndView();
		Map<String,Integer> map = new HashMap<>();
		map.put("article", articleNum);
		Boardserivce.updateCnt(map);
		mav.setViewName("/moveBoard");
		return mav;
	}
	
}
