package com.company.shopingram.domain.vo;

public class LikeViewVO {
	private String profileImg;
	private String memberId;
	private String contentsCode;
	
	public LikeViewVO(){
		
	}
	public LikeViewVO(String profileImg, String memberId, String contentsCode){
		this.profileImg=profileImg;
		this.memberId=memberId;
		this.contentsCode=contentsCode;
	}
	public String getProfileImg() {
		return profileImg;
	}
	public String getMemberId() {
		return memberId;
	}
	public String getContentsCode() {
		return contentsCode;
	}
	@Override
	public String toString() {
		return "LikeViewVO [profileImg=" + profileImg + ", memberId=" + memberId + ", contentsCode=" + contentsCode + "]";
	}
	
}
