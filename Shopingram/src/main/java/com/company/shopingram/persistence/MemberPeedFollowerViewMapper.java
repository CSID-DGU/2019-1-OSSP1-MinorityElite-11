package com.company.shopingram.persistence;

import com.company.shopingram.domain.vo.MemberPeedFollowerViewVO;

public interface MemberPeedFollowerViewMapper {
	MemberPeedFollowerViewVO searchFollowerView(String memberId);
}
