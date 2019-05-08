package com.company.shopingram.persistence;

import com.company.shopingram.domain.vo.MemberPeedContentsCntView;

public interface MemberPeedContentsCntViewMapper {
	public MemberPeedContentsCntView searchMemberPeedView(String memberId);
}
