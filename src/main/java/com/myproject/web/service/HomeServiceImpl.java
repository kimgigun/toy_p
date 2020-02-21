package com.myproject.web.service;

import com.myproject.web.mapper.HomeMapper;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	private HomeMapper mapper;

	public List<Map<String, Object>> getMenuList() throws Exception {
		return this.mapper.getMenuList();
	}
}