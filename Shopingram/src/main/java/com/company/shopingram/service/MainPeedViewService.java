package com.company.shopingram.service;

import java.util.List;

import com.company.shopingram.domain.vo.MainPeedViewVO;

public interface MainPeedViewService {

	List<MainPeedViewVO> mainPeedViewSearch(String memberId);
	
	MainPeedViewVO mainPeedViewByContentsCodeSearch(String contentCode);
	
}
