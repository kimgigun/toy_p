package com.myproject.web.service;

import com.myproject.web.domain.VisitCount;
import com.myproject.web.mapper.VisitCountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisitCountServiceImpl implements VisitCountSerivce {

	@Autowired
	VisitCountMapper mapper;

	public int addVisitCount(VisitCount visitData) throws Exception {
		return this.mapper.addVisitCount(visitData);
	}

	public Integer getAllVisitCount() throws Exception {
		return Integer.valueOf(this.mapper.getAllVisitCount());
	}

	public Integer getTodayVisitCount() throws Exception {
		return Integer.valueOf(this.mapper.getTodayVisitCount());
	}
}