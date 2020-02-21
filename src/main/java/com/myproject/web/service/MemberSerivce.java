package com.myproject.web.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.myproject.web.domain.Member;
@Service
public interface MemberSerivce {
	public List<Member> selectMemberInfoList(Map<?,?> map)throws Exception;
	public int insertMember(Member member)throws Exception;
	public Member findMemberInfo(Map<?,?> map)throws Exception;
	public Member checkMember(Member member)throws Exception;
	public int updateMemberInfo(Member member)throws Exception;
	public int deleteMemberInfo(Map<?,?>map)throws Exception;
}
