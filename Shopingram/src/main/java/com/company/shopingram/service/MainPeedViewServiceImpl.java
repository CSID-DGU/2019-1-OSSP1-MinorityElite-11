package com.company.shopingram.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.shopingram.domain.vo.MainPeedViewVO;
import com.company.shopingram.persistence.MainPeedViewMapper;

@Service
public class MainPeedViewServiceImpl implements MainPeedViewService {
	
	@Autowired
	MainPeedViewMapper mainPeedViewMapper;
	
	@Override
	public List<MainPeedViewVO> mainPeedViewSearch(String memberId) {
		return mainPeedViewMapper.searchMainPeedView(memberId);
	}
	
	@Override
	public MainPeedViewVO mainPeedViewByContentsCodeSearch(String contentCode) {
		return mainPeedViewMapper.searchMainPeedViewByContentsCode(contentCode);
	}
	
}
