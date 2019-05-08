package com.company.shopingram.domain.dto;

public class FormResponseDTO {
	String formResponseCode;
	String formCode;
	
	
	public FormResponseDTO() {
		this.formResponseCode = "formResponseCode";
		this.formCode = "formCode";
	}
	public FormResponseDTO(String formResponseCode, String formCode) {
		super();
		this.formResponseCode = formResponseCode;
		this.formCode = formCode;
	}
	public String getFormResponseCode() {
		return formResponseCode;
	}
	public void setFormResponseCode(String formResponseCode) {
		this.formResponseCode = formResponseCode;
	}
	public String getFormCode() {
		return formCode;
	}
	public void setFormCode(String formCode) {
		this.formCode = formCode;
	}

	@Override
	public String toString() {
		return "FormResponseDTO [formResponseCode=" + formResponseCode + ", formCode=" + formCode
				+"]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((formCode == null) ? 0 : formCode.hashCode());
		result = prime * result + ((formResponseCode == null) ? 0 : formResponseCode.hashCode());
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
		FormResponseDTO other = (FormResponseDTO) obj;
		if (formCode == null) {
			if (other.formCode != null)
				return false;
		} else if (!formCode.equals(other.formCode))
			return false;
		if (formResponseCode == null) {
			if (other.formResponseCode != null)
				return false;
		} else if (!formResponseCode.equals(other.formResponseCode))
			return false;
		return true;
	}
	
	
}
