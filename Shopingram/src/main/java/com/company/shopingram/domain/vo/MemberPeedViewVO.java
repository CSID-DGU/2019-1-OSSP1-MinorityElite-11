package com.company.shopingram.domain.vo;

public class MemberPeedViewVO {
	private String memberId;
	private String memberName;
	private String levelName;
	private String profileImg;
	private String profileIntro;
	private String profileWebsite;
	public MemberPeedViewVO(){
		
	}
	public MemberPeedViewVO(String memberId, String memberName, String levelName, String profileImg, String profileIntro,
			String profileWebsite) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.levelName = levelName;
		this.profileImg = profileImg;
		this.profileIntro = profileIntro;
		this.profileWebsite = profileWebsite;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getLevelName() {
		return levelName;
	}
	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}
	public String getProfileImg() {
		return profileImg;
	}
	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
	}
	public String getProfileIntro() {
		return profileIntro;
	}
	public void setProfileIntro(String profileIntro) {
		this.profileIntro = profileIntro;
	}
	public String getProfileWebsite() {
		return profileWebsite;
	}
	public void setProfileWebsite(String profileWebsite) {
		this.profileWebsite = profileWebsite;
	}
	@Override
	public String toString() {
		return "MainPeedViewVO [memberId=" + memberId + ", memberName=" + memberName + ", levelName=" + levelName
				+ ", profileImg=" + profileImg + ", profileIntro=" + profileIntro + ", profileWebsite=" + profileWebsite
				+ "]";
	}

}
