package com.myproject.web.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.myproject.web.domain.Member;

@Repository
public interface MemberMapper {
	public List<?> selectMemberInfoList()throws Exception;
	public int allOfArtCount()throws Exception;
	public Member findMemberInfo(Map<String,Object> map)throws Exception;
	public Member checkMemberInfo(Map<String,Object> map)throws Exception;
	public int insertMemberInfo()throws Exception;
	public int updateMemberInfo()throws Exception;
	public int deleteMemberInfo()throws Exception;
}
