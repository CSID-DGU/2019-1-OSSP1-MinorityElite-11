package com.company.shopingram.persistence;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.company.shopingram.domain.dto.ContentDTO;

public interface ContentMapper {
	public List<ContentDTO> loadContentList();
	public void addContentImg(@Param("contentCode")String contentCode,@Param("memberId") String memberId,@Param("contentsText")String contentsText,@Param("contentImg") String contentImg,@Param("contentsVideo") String contentsVideo,@Param("contentsDate") Timestamp contentsDate,@Param("contentsHidden") String contentsHidden);
	//public void updateContentText(@Param("contentCode") String contentCode,@Param("contentText") String contentText);
	public ContentDTO searchContentByContentCode(@Param("contentCode")String contentCode);
	public ContentDTO searchContentByCodeAndId(@Param("contentCode")String contentCode, @Param("memberId")String memberId);
	public List<ContentDTO> searchContentByMemberId(@Param("memberId")String memberId);
	public void updateContentTextByContentCode(@Param("contentCode")String contentCode, @Param("contentsText")String contentsText);
	public void updateContentHidden(@Param("contentsHidden")String contentsHidden, @Param("contentCode")String contentCode);
	public void deleteContent(@Param("contentCode")String contentCode, @Param("memberId")String memberId);
	public List<ContentDTO> searchContentText(@Param("contentsText")String contentsText);
}