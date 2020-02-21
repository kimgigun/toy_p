package com.myproject.web.controller;


import javax.servlet.http.HttpSession;

import org.mockito.internal.stubbing.answers.ThrowsException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.myproject.web.domain.Member;
import com.myproject.web.mapper.MemberMapper;
import com.myproject.web.service.MemberSerivce;

/**
 * Handles requests for the application home page.
 */
@Controller
public class MemberControrller {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	

	@Autowired 
	MemberSerivce serivce;
	
	@RequestMapping(value = "/authCheck", method = RequestMethod.POST)  
	public ModelAndView getCheck( HttpSession session, @ModelAttribute Member member)throws Exception { 
		ModelAndView mav = new ModelAndView();
		Member result = serivce.checkMember(member);
		
		if(result.getUSER_ID() != null){
			session.setAttribute("userId", member.getUSER_ID());
			session.setAttribute("userName",result.getUSER_NAME());
			mav.setViewName("main/main");
			mav.addObject("msg", "success");
		}else{
			mav.addObject("msg", "fail");
			mav.setViewName("login/login");
		}
		return mav;
	}
	
}
