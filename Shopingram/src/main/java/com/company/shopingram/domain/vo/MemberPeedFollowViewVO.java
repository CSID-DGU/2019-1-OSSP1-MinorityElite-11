package com.company.shopingram.domain.vo;

public class MemberPeedFollowViewVO {
	private String MemberId;
	private int followCnt;
	
	public MemberPeedFollowViewVO(){
		
	}
	public MemberPeedFollowViewVO(String memberId, int followCnt) {
		super();
		MemberId = memberId;
		this.followCnt = followCnt;
	}
	public String getMemberId() {
		return MemberId;
	}
	public void setMemberId(String memberId) {
		MemberId = memberId;
	}
	public int getFollowCnt() {
		return followCnt;
	}
	public void setFollowCnt(int followerCnt) {
		this.followCnt = followerCnt;
	}
	@Override
	public String toString() {
		return "MemberPeedFollowCntViewVO [MemberId=" + MemberId + ", followCnt=" + followCnt + "]";
	}
	
	
	
}
