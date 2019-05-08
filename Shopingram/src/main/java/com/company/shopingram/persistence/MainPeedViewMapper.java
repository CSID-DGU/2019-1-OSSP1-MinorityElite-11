package com.company.shopingram.persistence;

import java.util.List;

import com.company.shopingram.domain.vo.MainPeedViewVO;

public interface MainPeedViewMapper {

	List<MainPeedViewVO> searchMainPeedView(String memberId);
	
	MainPeedViewVO searchMainPeedViewByContentsCode(String contentCode);
	
}
