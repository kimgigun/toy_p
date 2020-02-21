package com.myproject.web.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.web.domain.Member;
import com.myproject.web.mapper.MemberMapper;
@Service
public class MemberServiceImpl implements MemberSerivce{

	@Autowired 
	MemberMapper mapper;
	
	@Override
	public List<Member> selectMemberInfoList(Map<?, ?> map) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertMember(Member member) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Member findMemberInfo(Map<?, ?> map) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateMemberInfo(Member member) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMemberInfo(Map<?, ?> map) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Member checkMember(Member member) throws Exception {
		Map<String,Object> map = new HashMap<>();
		map.put("userId", member.getUSER_ID());
		map.put("userPassword", member.getUSER_PASSWORD());
		Member result = mapper.checkMemberInfo(map);
		return result;

	}
}
