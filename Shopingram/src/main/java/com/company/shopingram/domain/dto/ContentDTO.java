package com.company.shopingram.domain.dto;


import java.sql.Timestamp;

public class ContentDTO {
	private String contentCode;
	private String memberId;
	private String contentsText;
	private String contentImg;
	private String contentsVideo;
	private Timestamp contentsdate;
	private String contentsHidden;
	
	public ContentDTO() {
		// TODO Auto-generated constructor stub
	}

	public ContentDTO(String contentCode, String memberId, String contentsText, String contentImg, String contentsVideo,
			Timestamp contentsdate, String contentsHidden) {
		super();
		this.contentCode = contentCode;
		this.memberId = memberId;
		this.contentsText = contentsText;
		this.contentImg = contentImg;
		this.contentsVideo = contentsVideo;
		this.contentsdate = contentsdate;
		this.contentsHidden = contentsHidden;
	}

	public String getContentCode() {
		return contentCode;
	}

	public void setContentCode(String contentCode) {
		this.contentCode = contentCode;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getContentsText() {
		return contentsText;
	}

	public void setContentsText(String contentsText) {
		this.contentsText = contentsText;
	}

	public String getContentImg() {
		return contentImg;
	}

	public void setContentImg(String contentImg) {
		this.contentImg = contentImg;
	}

	public String getContentsVideo() {
		return contentsVideo;
	}

	public void setContentsVideo(String contentsVideo) {
		this.contentsVideo = contentsVideo;
	}

	public Timestamp getContentsdate() {
		return contentsdate;
	}

	public void setContentsdate(Timestamp contentsdate) {
		this.contentsdate = contentsdate;
	}

	public String isContentsHidden() {
		return contentsHidden;
	}

	public void setContentsHidden(String contentsHidden) {
		this.contentsHidden = contentsHidden;
	}

	@Override
	public String toString() {
		return "ContentDTO [contentCode=" + contentCode + ", memberId=" + memberId + ", contentsText=" + contentsText
				+ ", contentImg=" + contentImg + ", contentsVideo=" + contentsVideo + ", contentsdate=" + contentsdate
				+ ", contentsHidden=" + contentsHidden + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContentDTO other = (ContentDTO) obj;
		if (contentImg == null) {
			if (other.contentImg != null)
				return false;
		} else if (!contentImg.equals(other.contentImg))
			return false;
		if (contentsHidden != other.contentsHidden)
			return false;
		if (contentCode == null) {
			if (other.contentCode != null)
				return false;
		} else if (!contentCode.equals(other.contentCode))
			return false;
		if (contentsText == null) {
			if (other.contentsText != null)
				return false;
		} else if (!contentsText.equals(other.contentsText))
			return false;
		if (contentsVideo == null) {
			if (other.contentsVideo != null)
				return false;
		} else if (!contentsVideo.equals(other.contentsVideo))
			return false;
		if (contentsdate == null) {
			if (other.contentsdate != null)
				return false;
		} else if (!contentsdate.equals(other.contentsdate))
			return false;
		if (memberId == null) {
			if (other.memberId != null)
				return false;
		} else if (!memberId.equals(other.memberId))
			return false;
		return true;
	}
	
	

}
