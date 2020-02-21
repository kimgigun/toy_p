package com.myproject.web.mapper;

import com.myproject.web.domain.VisitCount;
import org.springframework.stereotype.Repository;

@Repository
public abstract interface VisitCountMapper {
	public abstract int addVisitCount(VisitCount paramVisitCount) throws Exception;

	public abstract int getAllVisitCount() throws Exception;

	public abstract int getTodayVisitCount() throws Exception;
}