package com.company.shopingram.controller;

import java.util.ArrayList; 
import java.util.List;
import java.util.StringTokenizer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.company.shopingram.domain.vo.ContentsDetailViewVO;
import com.company.shopingram.service.ContentService;
import com.company.shopingram.service.ContentsDetailViewService;

@Controller
public class ContentController {
	Logger logger = LoggerFactory.getLogger(ContentController.class);
	
	@Autowired
	ContentService contentService;
	
	@Autowired
	ContentsDetailViewService contentsDetailService;
	
	@RequestMapping(value="/detailContents.do", method=RequestMethod.GET)
	public String contentsDetailViewSearch(@RequestParam("contentNum") String contentCode, @RequestParam("idNum") String memberId, Model model) {
		ContentsDetailViewVO contentsDetailView = contentsDetailService.contentsDetailViewSearch(memberId, contentCode);
		
		String text = contentsDetailView.getContentsText();
		
		StringTokenizer token = new StringTokenizer(text, "#");
		List<String> hashtag = new ArrayList<String>();
		
		if(token.hasMoreTokens()) {
			while(token.hasMoreTokens()) {
				String next = token.nextToken();
				hashtag.add(next);
			}
		}
		
		String newText = hashtag.get(0);
		contentsDetailView.setContentsText(newText);
		
		hashtag.remove(0);
		
		model.addAttribute("contentsDetailView", contentsDetailView);
		model.addAttribute("hashtag", hashtag);
		
		return "/content/detailContent";
	}
}
