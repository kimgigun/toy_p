package com.myproject.web.common.logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component 
@Aspect
public class LoggerAspect {
	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	protected String name;
	protected String type;
	
	@Around("execution(* com..controller.*Controller.*(..)) or execution(* com..service.*impl.*(..))")
	public Object logPrint(ProceedingJoinPoint  joinPoint) throws Throwable{
		 type = joinPoint.getSignature().getDeclaringTypeName();
		 System.out.println(type);
		 if(type.indexOf("Controller") > 0){
			 name = "Controller \t : ";
		 }else if(type.indexOf("ServiceImpl") > 0){  
			 name = "ServiceImpl \t : ";
		 }
		 logger.debug(name + type + "," + joinPoint.getSignature().getName() + "()");
		return joinPoint.proceed();
		
	}
	
	

}
