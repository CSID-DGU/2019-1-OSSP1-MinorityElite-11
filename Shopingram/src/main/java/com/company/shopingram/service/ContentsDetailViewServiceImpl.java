package com.company.shopingram.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.shopingram.domain.vo.ContentsDetailViewVO;
import com.company.shopingram.persistence.ContentsDetailViewMapper;

@Service
public class ContentsDetailViewServiceImpl implements ContentsDetailViewService{
	
	@Autowired
	ContentsDetailViewMapper contentsDetailViewMapper;
	
	@Override
	public ContentsDetailViewVO contentsDetailViewSearch(String memberId, String contentCode) {	
		return contentsDetailViewMapper.searchContentsDetailView(memberId, contentCode);
	}
}
