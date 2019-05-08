package com.company.shopingram.domain.vo;

public class ContentsDetailViewVO {
	private String profileImg;
	private String memberId;
	private String contentsImg;
	private String contentsText;
	private String likeCnt;
	private String contentCode;
	
	public ContentsDetailViewVO(String profileImg, String memberId, String contentsImg, String contentsText,
			String likeCnt, String contentCode) {
		super();
		this.profileImg = profileImg;
		this.memberId = memberId;
		this.contentsImg = contentsImg;
		this.contentsText = contentsText;
		this.likeCnt = likeCnt;
		this.contentCode = contentCode;
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

	public String getContentsText() {
		return contentsText;
	}

	public void setContentsText(String contentsText) {
		this.contentsText = contentsText;
	}

	public String getLikeCnt() {
		return likeCnt;
	}

	public void setLikeCnt(String likeCnt) {
		this.likeCnt = likeCnt;
	}

	public String getContentCode() {
		return contentCode;
	}

	public void setContentCode(String contentCode) {
		this.contentCode = contentCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contentCode == null) ? 0 : contentCode.hashCode());
		result = prime * result + ((contentsImg == null) ? 0 : contentsImg.hashCode());
		result = prime * result + ((contentsText == null) ? 0 : contentsText.hashCode());
		result = prime * result + ((likeCnt == null) ? 0 : likeCnt.hashCode());
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
		ContentsDetailViewVO other = (ContentsDetailViewVO) obj;
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
		if (contentsText == null) {
			if (other.contentsText != null)
				return false;
		} else if (!contentsText.equals(other.contentsText))
			return false;
		if (likeCnt == null) {
			if (other.likeCnt != null)
				return false;
		} else if (!likeCnt.equals(other.likeCnt))
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

	@Override
	public String toString() {
		return "ContentsDetailViewVO [profileImg=" + profileImg + ", memberId=" + memberId + ", contentsImg="
				+ contentsImg + ", contentsText=" + contentsText + ", likeCnt=" + likeCnt + ", contentCode="
				+ contentCode + "]";
	}
}
