package com.company.shopingram.persistence;

import com.company.shopingram.domain.vo.MemberPeedViewVO;

public interface MemberPeedViewMapper {
	public MemberPeedViewVO searchMemberPeedView(String memberId);
}
