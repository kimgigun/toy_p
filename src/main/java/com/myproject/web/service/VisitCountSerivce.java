package com.myproject.web.service;

import com.myproject.web.domain.VisitCount;
import org.springframework.stereotype.Service;

@Service
public abstract interface VisitCountSerivce {
	public abstract int addVisitCount(VisitCount paramVisitCount) throws Exception;

	public abstract Integer getAllVisitCount() throws Exception;

	public abstract Integer getTodayVisitCount() throws Exception;
}