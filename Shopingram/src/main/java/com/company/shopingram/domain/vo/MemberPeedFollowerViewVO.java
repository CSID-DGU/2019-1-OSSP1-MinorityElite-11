package com.company.shopingram.domain.vo;

public class MemberPeedFollowerViewVO {
	private String MemberId;
	private int followerCnt;
	
	public MemberPeedFollowerViewVO(){
		
	}
	public MemberPeedFollowerViewVO(String memberId, int followerCnt) {
		super();
		MemberId = memberId;
		this.followerCnt = followerCnt;
	}
	public String getMemberId() {
		return MemberId;
	}
	public void setMemberId(String memberId) {
		MemberId = memberId;
	}
	public int getFollowerCnt() {
		return followerCnt;
	}
	public void setFollowerCnt(int followerCnt) {
		this.followerCnt = followerCnt;
	}
	@Override
	public String toString() {
		return "MemberPeedFolloerViewVO [MemberId=" + MemberId + ", followerCnt=" + followerCnt + "]";
	}
	
	
	
}
