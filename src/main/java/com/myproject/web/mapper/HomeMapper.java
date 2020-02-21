package com.myproject.web.mapper;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public abstract interface HomeMapper {
	public abstract List<Map<String, Object>> getMenuList() throws Exception;
}