package com.myproject.web.intercepter;

import com.myproject.web.domain.VisitCount;
import com.myproject.web.service.VisitCountSerivce;
import java.io.PrintStream;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class AuthenticationInterceptor extends HandlerInterceptorAdapter
{
  private static final Logger logger = LoggerFactory.getLogger(AuthenticationInterceptor.class);

  @Resource
  private VisitCountSerivce visitCountSerivce;
  private HttpSession session;

  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
    throws Exception
  {
    this.session = request.getSession();

    if (this.session.getAttribute("todayCount") == null) {
      visitCount();
    }

    return true;
  }

  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
    throws Exception
  {
    super.postHandle(request, response, handler, modelAndView);
  }

  public void visitCount()
  {
    try
    {
      String ip = getIpAddress();
      VisitCount visitCount = new VisitCount();
      visitCount.setVisitIp(ip);
      logger.debug(" ===> ip : " + ip);

      int insertNum = this.visitCountSerivce.addVisitCount(visitCount);

      int totalCount = this.visitCountSerivce.getAllVisitCount().intValue();

      int todayCount = this.visitCountSerivce.getTodayVisitCount().intValue();

      logger.debug("insertNum:" + insertNum);
      logger.debug("totalCount:" + totalCount);
      logger.debug("todayCount:" + todayCount);

      this.session.setAttribute("totalCount", Integer.valueOf(totalCount));
      this.session.setAttribute("todayCount", Integer.valueOf(todayCount));
    }
    catch (Exception e) {
      System.out.println("===== 방문자 카운터 오류 =====\n");
      e.printStackTrace();
    }
  }

  public String getIpAddress()
  {
    HttpServletRequest req = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest();
    String ip = req.getHeader("X-FORWARDED-FOR");
    if (ip == null) {
      ip = req.getRemoteAddr();
    }
    return ip;
  }
}