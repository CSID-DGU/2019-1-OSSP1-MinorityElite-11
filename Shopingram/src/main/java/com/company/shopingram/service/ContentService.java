package com.company.shopingram.service;

import java.util.List;
import java.util.Map;

import com.company.shopingram.domain.dto.ContentDTO;

public interface ContentService {
	public boolean contentLoadList();
	public ContentDTO contentAddImg(String contentText, String contentImg, String memberId);
	public ContentDTO contentAddImgNoneContext(String contentImg, String memberId);
	public ContentDTO contentAddVideo(String contentText, String contentVideo, String memberId);
	public ContentDTO contentAddVideoNoneContext(String contentVideo, String memberId);
//	public ContentDTO contentTextUpdate(String contentCode, String contentText);
	public ContentDTO contentByContentCodeSearch(String contentCode);
	public ContentDTO contentByCodeAndIdSearch(String contentCode, String memberId);
	public List<ContentDTO> contentByMemberIdSearch(String memberId);
	public ContentDTO contentTextByContentCodeUpdate(String contentCode, String contentsText);
	public ContentDTO contentHiddenUpdate(String contentHidden, String contentCode);
	public boolean contentDelete(String contentCode, String memberId);
	public List<ContentDTO> contentTextSearch(String contentsText);
}
