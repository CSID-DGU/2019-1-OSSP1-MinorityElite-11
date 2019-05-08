package com.company.shopingram.persistence;

import com.company.shopingram.domain.vo.MemberPeedFollowViewVO;

public interface MemberPeedFollowViewMapper {
	MemberPeedFollowViewVO searchFollowView(String memberId);
}
