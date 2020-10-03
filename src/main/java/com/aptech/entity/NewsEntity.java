package com.aptech.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "news")
public class NewsEntity extends BaseEntity{

	@Column(name = "tittle")
	private String tittle;
	
	@Column(name = "content", columnDefinition = "TEXT")
	private String content;
	
	@Column(name = "shotdecription", columnDefinition = "TEXT")
	private String shotDecription;
	
	@Column(name = "thumbnail")
	private String thumbnail;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id")
	private CategoryEntity category;
	
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getShotDecription() {
		return shotDecription;
	}
	public void setShotDecription(String shotDecription) {
		this.shotDecription = shotDecription;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public CategoryEntity getCategory() {
		return category;
	}
	public void setCategory(CategoryEntity category) {
		this.category = category;
	}
	

}
