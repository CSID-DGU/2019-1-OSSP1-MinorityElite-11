package com.company.shopingram.service;

import com.company.shopingram.domain.vo.ContentsDetailViewVO;

public interface ContentsDetailViewService {
	public ContentsDetailViewVO contentsDetailViewSearch(String memberId, String contentCode);
}
