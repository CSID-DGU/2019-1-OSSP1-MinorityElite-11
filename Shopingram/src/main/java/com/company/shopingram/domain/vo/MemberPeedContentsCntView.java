package com.company.shopingram.domain.vo;

public class MemberPeedContentsCntView {
	private String memberId;
	private String memberName;
	private int cnt;
	
	public MemberPeedContentsCntView(){
		
	}
	public MemberPeedContentsCntView(String memberId, String memberName, int cnt) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.cnt = cnt;
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
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	@Override
	public String toString() {
		return "MemberPeedContentsCntView [memberId=" + memberId + ", MemberName=" + memberName + ", cnt=" + cnt + "]";
	}
	
	
}
