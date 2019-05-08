package com.company.shopingram.domain.dto;

public class LikeDTO {
	private String likeCode;
	private String memberId;
	private String contentsCode;
	
	public LikeDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public LikeDTO(String memberId, String contentsCode) {
		super();
		this.memberId = memberId;
		this.contentsCode = contentsCode;
	}

	public LikeDTO(String likeCode, String memberId, String contentsCode) {
		super();
		this.likeCode = likeCode;
		this.memberId = memberId;
		this.contentsCode = contentsCode;
	}

	public String getLikeCode() {
		return likeCode;
	}

	public void setLikeCode(String likeCode) {
		this.likeCode = likeCode;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getContentsCode() {
		return contentsCode;
	}

	public void setContentsCode(String contentsCode) {
		this.contentsCode = contentsCode;
	}

	@Override
	public String toString() {
		return "LikeDTO [likeCode=" + likeCode + ", memberId=" + memberId + ", contentsCode=" + contentsCode + "]";
	}

}
