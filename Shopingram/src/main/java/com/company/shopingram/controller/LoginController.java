package com.company.shopingram.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.company.shopingram.domain.dto.MemberDTO;
import com.company.shopingram.service.MemberService;

@Controller
public class LoginController {
	public static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private MemberService service;

	
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public String login(@RequestParam("id")String memberID,@RequestParam("pwd")String memberPwd
			,Model model,HttpSession session, RedirectAttributes redirect) {
		if(session.getAttribute("memberId")!=null){
			/*HttpUtil.forward(request, response, "/mainPeedView.do");*/
			logger.info("로그인 상태");
			return "redirect:/mainPeedView.do";
		}
		
		String path = null;
		if(session.isNew() || session.getAttribute("memberId") == null){
			/*memberDao.searchMember(memberID, memberPwd)*/	
			MemberDTO dto = service.memberSearch(memberID, memberPwd);
			if(dto != null){
					logger.info("로그인 성공 : "+memberID);
					session.setAttribute("memberId", memberID);
					session.setAttribute("levelCode", dto.getLevelCode());
					redirect.addAttribute("memberId", memberID);
					path="redirect:/mainPeedView.do";
				}
				else{
					logger.info("로그인 실패");
					model.addAttribute("error", "아이디와 비밀번호를 확인하여 주십시오.");
					path="login";
				}
					
		}
		return path;
	}

}
