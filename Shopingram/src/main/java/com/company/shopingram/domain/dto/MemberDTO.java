package com.company.shopingram.domain.dto;

public class MemberDTO {
	private String memberId;
	private String pwd;
	private String name;
	private String mail;
	private String addr;
	private String rangeCode;
	private String phone;
	private String levelCode;
	
	public MemberDTO(){
		memberId = "아이디 없음";
		pwd = "비밀번호 없음";
		name = "이름 없음";
		mail = "이메일 없음";
		addr = "주소 없음";
		rangeCode = "OP";
		phone = "전화번호 없음";
		levelCode = "NM";
	}

	public MemberDTO(String memberId, String pwd, String name, String mail, String addr, String rangeCode, String phone,
			String levelCode) {
		super();
		this.memberId = memberId;
		this.pwd = pwd;
		this.name = name;
		this.mail = mail;
		this.addr = addr;
		this.rangeCode = rangeCode;
		this.phone = phone;
		this.levelCode = levelCode;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getRangeCode() {
		return rangeCode;
	}

	public void setRangeCode(String rangeCode) {
		this.rangeCode = rangeCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getLevelCode() {
		return levelCode;
	}

	public void setLevelCode(String levelCode) {
		this.levelCode = levelCode;
	}

	@Override
	public String toString() {
		return "MemberDTO [memberId=" + memberId + ", pwd=" + pwd + ", name=" + name + ", mail=" + mail + ", addr="
				+ addr + ", rangeCode=" + rangeCode + ", phone=" + phone + ", levelCode=" + levelCode + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addr == null) ? 0 : addr.hashCode());
		result = prime * result + ((levelCode == null) ? 0 : levelCode.hashCode());
		result = prime * result + ((mail == null) ? 0 : mail.hashCode());
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((pwd == null) ? 0 : pwd.hashCode());
		result = prime * result + ((rangeCode == null) ? 0 : rangeCode.hashCode());
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
		MemberDTO other = (MemberDTO) obj;
		if (addr == null) {
			if (other.addr != null)
				return false;
		} else if (!addr.equals(other.addr))
			return false;
		if (levelCode == null) {
			if (other.levelCode != null)
				return false;
		} else if (!levelCode.equals(other.levelCode))
			return false;
		if (mail == null) {
			if (other.mail != null)
				return false;
		} else if (!mail.equals(other.mail))
			return false;
		if (memberId == null) {
			if (other.memberId != null)
				return false;
		} else if (!memberId.equals(other.memberId))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (pwd == null) {
			if (other.pwd != null)
				return false;
		} else if (!pwd.equals(other.pwd))
			return false;
		if (rangeCode == null) {
			if (other.rangeCode != null)
				return false;
		} else if (!rangeCode.equals(other.rangeCode))
			return false;
		return true;
	}
	
	
}
