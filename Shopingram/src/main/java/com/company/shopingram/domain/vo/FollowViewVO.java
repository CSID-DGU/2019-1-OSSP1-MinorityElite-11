package com.company.shopingram.domain.vo;

public class FollowViewVO {
	private String profile_img;
	private String follow_id;
	private String member_name;
	
	public FollowViewVO(String profile_img, String follow_id) {
		super();
		this.profile_img = profile_img;
		this.follow_id = follow_id;
	}
	public FollowViewVO(String profile_img, String follow_id, String member_name) {
		super();
		this.profile_img = profile_img;
		this.follow_id = follow_id;
		this.member_name = member_name;
	}
	public String getProfile_img() {
		return profile_img;
	}
	public void setProfile_img(String profile_img) {
		this.profile_img = profile_img;
	}
	public String getFollow_id() {
		return follow_id;
	}
	public void setFollow_id(String follow_id) {
		this.follow_id = follow_id;
	}
	
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	
	
	
	@Override
	public String toString() {
		return "FollowViewVO [profile_img=" + profile_img + ", follow_id=" + follow_id + ", member_name=" + member_name
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((follow_id == null) ? 0 : follow_id.hashCode());
		result = prime * result + ((profile_img == null) ? 0 : profile_img.hashCode());
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
		FollowViewVO other = (FollowViewVO) obj;
		if (follow_id == null) {
			if (other.follow_id != null)
				return false;
		} else if (!follow_id.equals(other.follow_id))
			return false;
		if (profile_img == null) {
			if (other.profile_img != null)
				return false;
		} else if (!profile_img.equals(other.profile_img))
			return false;
		return true;
	}
}
