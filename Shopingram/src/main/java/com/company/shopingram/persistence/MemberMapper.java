package com.company.shopingram.persistence;

import java.util.List;
import java.util.Map;

import com.company.shopingram.domain.dto.MemberDTO;

public interface MemberMapper {
	public void addMember(MemberDTO mem) throws Exception;
	
	public void deleteMember(MemberDTO mem) throws Exception;
	
	public List<MemberDTO> searchMemberByName(String member_name) throws Exception;
	
	public MemberDTO searchMemberById(String member_id) throws Exception;
	
	public MemberDTO searchMemberByIdAndPwd(Map<String, String> map) throws Exception;
	
	public String searchMemberId(String member_mail) throws Exception;
	
	public String searchMemberPwd(Map<String, String> map) throws Exception;
	
	public void updateMember(MemberDTO mem) throws Exception;
	
	public void updateMemberLevelCode(Map<String, String> map) throws Exception;
	
	public void updateMemberRangeCode(Map<String, String> map) throws Exception;
	
	public void updateMemberPwd(Map<String, String> map) throws Exception;
}
