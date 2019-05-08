package com.company.shopingram.service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.shopingram.domain.dto.ContentDTO;
import com.company.shopingram.persistence.ContentMapper;

@Service
public class ContentServiceImpl implements ContentService {
	Logger logger=LoggerFactory.getLogger(ContentServiceImpl.class);
	@Autowired
	ContentMapper mapper;
		
//	private Map<String, ContentDTO> contentList;
	private static int contentNum;
	
	private String generateContentCode() {
		contentNum++;
		return "contentCode-"+contentNum;
	}
	
	public boolean contentLoadList(){
		List<ContentDTO> contents=null;
		int maxNum=0;
		
		 contents=mapper.loadContentList();
		 if(contents==null)
			  return false;
		 for(int i=0;i<contents.size();i++) {
			 contentNum=Integer.parseInt(contents.get(i).getContentCode().substring(12));
			 if(maxNum<contentNum)
				 maxNum=contentNum;
		 }
		 contentNum=maxNum;
		 return true;
	}
	
	public ContentDTO contentAddImg(String contentsText, String contentImg, String memberId) {
		if(contentImg==null || memberId==null) return null;
		contentLoadList();
		String contentCode=generateContentCode();
		Timestamp contentsDate=Timestamp.valueOf(LocalDateTime.now());
		String contentsHidden="N";
		String contentsVideo="";
		contentImg=".image/content/"+contentImg;
		
		ContentDTO contentDTO = new ContentDTO(contentCode, memberId, contentsText, contentImg, "", contentsDate, contentsHidden);
		StringTokenizer strToken = new StringTokenizer(contentsText, "#");
		List<String> data = new ArrayList<String>();
		
		while(strToken.hasMoreTokens()){
			String next = strToken.nextToken();
			data.add(next);
		}
		
		data.remove(0);
		
		String[] hashtags = new String[data.size()];
		
		for(int i=0; i<data.size(); i++){
			hashtags[i] = data.get(i);
		}
		mapper.addContentImg(contentCode, memberId, contentsText, contentImg, contentsVideo,contentsDate, contentsHidden);
		return contentDTO;
	}
	
	public ContentDTO contentAddImgNoneContext(String contentImg, String memberId) {
		if(contentImg==null || memberId==null) return null;
		contentLoadList();
		String contentCode=generateContentCode();
		Timestamp contentsDate=Timestamp.valueOf(LocalDateTime.now());
		String contentsHidden="N";
		String contentsVideo="";
		contentImg=".image/content/"+contentImg;
		
		ContentDTO contentDTO = new ContentDTO(contentCode, memberId, "", contentImg, "", contentsDate, contentsHidden);
		mapper.addContentImg(contentCode, memberId, "", contentImg, contentsVideo,contentsDate, contentsHidden);
		return contentDTO;
	}
	
	public ContentDTO contentAddVideo(String contentsText, String contentsVideo, String memberId) {
		if(contentsVideo==null || memberId==null) return null;
		contentLoadList();
		String contentCode=generateContentCode();
		Timestamp contentsDate=Timestamp.valueOf(LocalDateTime.now());
		String contentsHidden="N";
		
		ContentDTO contentDTO = new ContentDTO(contentCode, memberId, contentsText, "", contentsVideo, contentsDate, contentsHidden);
		StringTokenizer strToken = new StringTokenizer(contentsText, "#");
		List<String> data = new ArrayList<String>();
		
		while(strToken.hasMoreTokens()){
			String next = strToken.nextToken();
			data.add(next);
		}
		
		data.remove(0);
		
		String[] hashtags = new String[data.size()];
		
		for(int i=0; i<data.size(); i++){
			hashtags[i] = data.get(i);
		}
		mapper.addContentImg(contentCode, memberId, contentsText, "", contentsVideo,contentsDate, contentsHidden);
		return contentDTO;
	}
	
	public ContentDTO contentAddVideoNoneContext(String contentsVideo, String memberId) {
		if(contentsVideo==null || memberId==null) return null;
		contentLoadList();
		String contentCode=generateContentCode();
		Timestamp contentsDate=Timestamp.valueOf(LocalDateTime.now());
		String contentsHidden="N";
		
		ContentDTO contentDTO = new ContentDTO(contentCode, memberId, "", "", contentsVideo, contentsDate, contentsHidden);
		mapper.addContentImg(contentCode, memberId, "", "", contentsVideo,contentsDate, contentsHidden);
		return contentDTO;
	}
	
	public ContentDTO contentByContentCodeSearch(String contentCode) {
		return mapper.searchContentByContentCode(contentCode);
	}
	
	public ContentDTO contentByCodeAndIdSearch(String contentCode, String memberId) {
		return mapper.searchContentByCodeAndId(contentCode,memberId);
	}
	
	public List<ContentDTO> contentByMemberIdSearch(String memberId){
		return mapper.searchContentByMemberId(memberId);
	}
	
	public ContentDTO contentTextByContentCodeUpdate(String contentCode, String contentsText) {
		if(contentCode == null||contentsText==null) return null;
		
		ContentDTO contentDTO=contentByContentCodeSearch(contentCode);
		contentDTO.setContentsText(contentsText);
		
		mapper.updateContentTextByContentCode(contentCode, contentsText);
		
		return contentDTO;
	}
	
	public ContentDTO contentHiddenUpdate(String contentHidden, String contentCode) {
		if(contentCode == null) return null;
		
		ContentDTO contentDTO=contentByContentCodeSearch(contentCode);
		contentDTO.setContentsHidden(contentHidden);
		
		mapper.updateContentHidden(contentHidden, contentCode);
		
		return contentDTO;
	}
	
	public boolean contentDelete(String contentCode, String memberId) {
		if(contentCode == null || memberId == null) return false;
		
		ContentDTO contentDTO=contentByCodeAndIdSearch(contentCode, memberId);
		if(contentDTO == null)
			return false;
		
		mapper.deleteContent(contentCode, memberId);
		
		return true;
	}
	
	public List<ContentDTO> contentTextSearch(String contentsText){
		List<ContentDTO> list=null;
		
		if(contentsText == null || contentsText.length() == 0) return null;
		
		list=mapper.searchContentText(contentsText);
		
		return list;
		
	}
//	public ContentDTO contentTextUpdate(String contentCode, String contentText) {
//		if(contentCode == null||contentText==null) return null;
//		
//		mapper.updateContentText(contentCode, contentText);
//		
//	}
}
