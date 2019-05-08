package com.company.shopingram.domain.dto;

import java.util.Date;

public class FormDTO {
	private String formCode;
	private String formTitle;
	private String formContent;
	private String memberId;
	//boolean -> String으로 고침!!
	private String period_flag;
	private Date formStartDate;
	private Date formEndDate;
	
	public FormDTO() { }

	public FormDTO(String formCode, String formTitle, String formContent, String memberId, String period_flag,
			Date formStartDate, Date formEndDate) {
		super();
		this.formCode = formCode;
		this.formTitle = formTitle;
		this.formContent = formContent;
		this.memberId = memberId;
		this.period_flag = period_flag;
		this.formStartDate = formStartDate;
		this.formEndDate = formEndDate;
	}

	public FormDTO(String formCode, String formTitle, String formContent, String memberId, String period_flag) {
		super();
		this.formCode = formCode;
		this.formTitle = formTitle;
		this.formContent = formContent;
		this.memberId = memberId;
		this.period_flag = period_flag;
	}

	public FormDTO(String formCode, String formTitle, String memberId, String period_flag, Date formStartDate,
			Date formEndDate) {
		super();
		this.formCode = formCode;
		this.formTitle = formTitle;
		this.memberId = memberId;
		this.period_flag = period_flag;
		this.formStartDate = formStartDate;
		this.formEndDate = formEndDate;
	}

	public FormDTO(String formCode, String formTitle, String memberId, String period_flag) {
		super();
		this.formCode = formCode;
		this.formTitle = formTitle;
		this.memberId = memberId;
		this.period_flag = period_flag;
	}

	public String getFormCode() {
		return formCode;
	}

	public void setFormCode(String formCode) {
		this.formCode = formCode;
	}

	public String getFormTitle() {
		return formTitle;
	}

	public void setFormTitle(String formTitle) {
		this.formTitle = formTitle;
	}

	public String getFormContent() {
		return formContent;
	}

	public void setFormContent(String formContent) {
		this.formContent = formContent;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String isPeriod_flag() {
		return period_flag;
	}

	public void setPeriod_flag(String period_flag) {
		this.period_flag = period_flag;
	}

	public Date getFormStartDate() {
		return formStartDate;
	}

	public void setFormStartDate(Date formStartDate) {
		this.formStartDate = formStartDate;
	}

	public Date getFormEndDate() {
		return formEndDate;
	}

	public void setFormEndDate(Date formEndDate) {
		this.formEndDate = formEndDate;
	}

	@Override
	public String toString() {
		return "FormDTO [formCode=" + formCode + ", formTitle=" + formTitle + ", formContent=" + formContent
				+ ", memberId=" + memberId + ", period_flag=" + period_flag + ", formStartDate=" + formStartDate
				+ ", formEndDate=" + formEndDate + "]";
	}

	
}
