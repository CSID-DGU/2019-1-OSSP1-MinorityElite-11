package com.company.shopingram.domain.vo;

public class MainPeedViewVO {
	private String contentCode;
	private String profileImg;
	private String memberId;
	private String contentsImg;
	
	public MainPeedViewVO(){
		
	}
	
	public MainPeedViewVO(String profileImg, String memberId, String contentsImg,String contentCode) {
		super();
		this.contentCode=contentCode;
		this.profileImg = profileImg;
		this.memberId = memberId;
		this.contentsImg = contentsImg;
	}
	
	public String getContentCode() {
		return contentCode;
	}

	public void setContentCode(String contentCode) {
		this.contentCode = contentCode;
	}

	public MainPeedViewVO(String profileImg, String memberId, String contentsImg) {
		super();
		this.profileImg = profileImg;
		this.memberId = memberId;
		this.contentsImg = contentsImg;
	}
	public String getProfileImg() {
		return profileImg;
	}
	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getContentsImg() {
		return contentsImg;
	}
	public void setContentsImg(String contentsImg) {
		this.contentsImg = contentsImg;
	}

	@Override
	public String toString() {
		return "MainPeedViewVO [contentCode=" + contentCode + ", profileImg=" + profileImg + ", memberId=" + memberId
				+ ", contentsImg=" + contentsImg + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contentCode == null) ? 0 : contentCode.hashCode());
		result = prime * result + ((contentsImg == null) ? 0 : contentsImg.hashCode());
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
		result = prime * result + ((profileImg == null) ? 0 : profileImg.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MainPeedViewVO other = (MainPeedViewVO) obj;
		if (contentCode == null) {
			if (other.contentCode != null)
				return false;
		} else if (!contentCode.equals(other.contentCode))
			return false;
		if (contentsImg == null) {
			if (other.contentsImg != null)
				return false;
		} else if (!contentsImg.equals(other.contentsImg))
			return false;
		if (memberId == null) {
			if (other.memberId != null)
				return false;
		} else if (!memberId.equals(other.memberId))
			return false;
		if (profileImg == null) {
			if (other.profileImg != null)
				return false;
		} else if (!profileImg.equals(other.profileImg))
			return false;
		return true;
	}
	

	
	
	
}
