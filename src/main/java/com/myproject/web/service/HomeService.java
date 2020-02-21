package com.myproject.web.service;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public abstract interface HomeService {
	public abstract List<Map<String, Object>> getMenuList() throws Exception;
}