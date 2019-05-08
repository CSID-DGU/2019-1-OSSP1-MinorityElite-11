package com.company.shopingram.service;

import java.util.List;

import com.company.shopingram.domain.dto.MemberDTO;

public interface MemberService {
	public MemberDTO memberAdd(MemberDTO mem);
	
	public boolean memberDelete(String member_id, String member_pwd);
	
	public List<MemberDTO> memberSearch(String name);
	
	public MemberDTO memberSearch(String memberId, int flag);
	
	public MemberDTO memberSearch(String memberId, String pwd);
	
	public String memberIdSearch(String mail);
	
	public String memberPwdSearch(String memberId, String mail);
	
	public MemberDTO memberUpdate(MemberDTO mem);
	
	public MemberDTO memberLevelCodeUpdate(String memberId, String pwd, String levelCode);
	
	public MemberDTO memberRangeCodeUpdate(String memberId, String pwd, String rangeCode);
	
	public MemberDTO memberPwdUpdate(String memberId, String pwd, String newPwd); 
	
	public String memberRegistSeller(String wrkrRegNo, String repName);
}
