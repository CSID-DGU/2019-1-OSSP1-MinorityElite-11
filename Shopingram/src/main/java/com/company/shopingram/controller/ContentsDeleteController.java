package com.company.shopingram.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.company.shopingram.service.ContentService;

@Controller
public class ContentsDeleteController {
	@Autowired 
	ContentService contentsService;
	
	@RequestMapping(value="/ContentsDelete.do", method=RequestMethod.GET)
	public String contentsDelete(HttpSession session, @RequestParam("memberId") String memberId, @RequestParam("contentCode") String contentCode) {
		String sessionId=(String)session.getAttribute("memberId");
		String levelCode=(String)session.getAttribute("levelCode");
		//관리자이면
		if(levelCode.equals("AD")) {
			contentsService.contentDelete(contentCode, memberId);
		}
		//관리자가 아니면
		else {
			if(sessionId.equals(memberId)) {
				contentsService.contentDelete(contentCode, memberId);
			}
		}
		
		return "/userpeed";
	}
}
