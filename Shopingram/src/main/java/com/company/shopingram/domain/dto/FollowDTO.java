package com.company.shopingram.domain.dto;

public class FollowDTO {
	private String followNum;
	private String followId;
	private String followerId;
	
	public FollowDTO(){
		
	}
	public FollowDTO(String followNum, String followId, String followerId){
		this.followNum=followNum;
		this.followId=followId;
		this.followerId=followerId;
	}
	public FollowDTO(String followId, String followerId){
		this.followId=followId;
		this.followerId=followerId;
	}
	public String getFollowNum() {
		return followNum;
	}
	public void setFollowNum(String followNum) {
		this.followNum = followNum;
	}
	public String getFollowId() {
		return followId;
	}
	public void setFollowId(String followId) {
		this.followId = followId;
	}
	public String getFollowerId() {
		return followerId;
	}
	public void setFollowerId(String followerId) {
		this.followerId = followerId;
	}
	
	@Override
	public String toString() {
		return "FollowDTO [followNum=" + followNum + ", followId=" + followId + ", followerId=" + followerId + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FollowDTO other = (FollowDTO) obj;
		if (followId == null) {
			if (other.followId != null)
				return false;
		} else if (!followId.equals(other.followId))
			return false;
		if (followNum == null) {
			if (other.followNum != null)
				return false;
		} else if (!followNum.equals(other.followNum))
			return false;
		if (followerId == null) {
			if (other.followerId != null)
				return false;
		} else if (!followerId.equals(other.followerId))
			return false;
		return true;
	}
	
}
