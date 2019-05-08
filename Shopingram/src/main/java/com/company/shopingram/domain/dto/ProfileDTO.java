package com.company.shopingram.domain.dto;

public class ProfileDTO {
	private String profileId;
	private String memberId;
	private String profileIntro;
	private String profileImg;
	private String profileWebSite;
	
	public ProfileDTO(){
		
	}
	public ProfileDTO(String profileId, String memberId, String profileIntro, String profileImg, String profileWebSite){
		this.profileId=profileId;
		this.memberId=memberId;
		this.profileIntro=profileIntro;
		this.profileImg=profileImg;
		this.profileWebSite=profileWebSite;
	}
	public ProfileDTO(String memberId, String profileIntro, String profileImg, String profileWebSite){
		this.memberId=memberId;
		this.profileIntro=profileIntro;
		this.profileImg=profileImg;
		this.profileWebSite=profileWebSite;
	}
	public String getProfileId() {
		return profileId;
	}
	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getProfileIntro() {
		return profileIntro;
	}
	public void setProfileIntro(String profileIntro) {
		this.profileIntro = profileIntro;
	}
	public String getProfileImg() {
		return profileImg;
	}
	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
	}
	public String getProfileWebSite() {
		return profileWebSite;
	}
	public void setProfileWebSite(String profileWebSite) {
		this.profileWebSite = profileWebSite;
	}
	@Override
	public String toString() {
		return "ProfileDTO [profileId=" + profileId + ", memberId=" + memberId + ", profileIntro=" + profileIntro
				+ ", profileImg=" + profileImg + ", profileWebSite=" + profileWebSite + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProfileDTO other = (ProfileDTO) obj;
		if (memberId == null) {
			if (other.memberId != null)
				return false;
		} else if (!memberId.equals(other.memberId))
			return false;
		if (profileId == null) {
			if (other.profileId != null)
				return false;
		} else if (!profileId.equals(other.profileId))
			return false;
		if (profileImg == null) {
			if (other.profileImg != null)
				return false;
		} else if (!profileImg.equals(other.profileImg))
			return false;
		if (profileIntro == null) {
			if (other.profileIntro != null)
				return false;
		} else if (!profileIntro.equals(other.profileIntro))
			return false;
		if (profileWebSite == null) {
			if (other.profileWebSite != null)
				return false;
		} else if (!profileWebSite.equals(other.profileWebSite))
			return false;
		return true;
	}
	
}
