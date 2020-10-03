package com.aptech.dto;

public class NewsDTO extends AbstractDTO<NewsDTO> {
	private String tittle;
	private String thumbnail;
	private String shotDecription;
	private String content;
	private Long categoryId;
	private String categoryCode;
	

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getShotDecription() {
		return shotDecription;
	}

	public void setShotDecription(String shotDecription) {
		this.shotDecription = shotDecription;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

}
