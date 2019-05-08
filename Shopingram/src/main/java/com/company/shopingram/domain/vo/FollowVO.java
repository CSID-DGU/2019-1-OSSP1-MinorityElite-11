package com.company.shopingram.domain.vo;

public class FollowVO {
	private String followCode;
	private String followerId;
	private String followId;
	
	public FollowVO(){
		
	}
	public FollowVO(String followCode, String followerId, String followId) {
		super();
		this.followCode = followCode;
		this.followerId = followerId;
		this.followId = followId;
	}
	public String getFollowCode() {
		return followCode;
	}
	public void setFollowCode(String followCode) {
		this.followCode = followCode;
	}
	public String getFollowerId() {
		return followerId;
	}
	public void setFollowerId(String followerId) {
		this.followerId = followerId;
	}
	public String getFollowId() {
		return followId;
	}
	public void setFollowId(String followId) {
		this.followId = followId;
	}
	@Override
	public String toString() {
		return "FollowVO [followCode=" + followCode + ", followerId=" + followerId + ", followId=" + followId + "]";
	}
	
	
}
