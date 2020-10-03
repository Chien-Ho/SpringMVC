package com.aptech.converter;

import org.springframework.stereotype.Component;

import com.aptech.dto.NewsDTO;
import com.aptech.entity.NewsEntity;
@Component
public class NewsConverter {
	public NewsDTO toDTO(NewsEntity entity) {
		NewsDTO newsDTO = new NewsDTO();
		newsDTO.setId(entity.getId());
		newsDTO.setTittle(entity.getTittle());
		newsDTO.setShotDecription(entity.getShotDecription());
		newsDTO.setContent(entity.getContent());
		newsDTO.setThumbnail(entity.getThumbnail());
		newsDTO.setCategoryCode(entity.getCategory().getCode());
		return newsDTO;
		
	}
	public NewsEntity toEntity(NewsDTO newsDTO, NewsEntity entity) {
		entity.setTittle(newsDTO.getTittle());
		entity.setContent(newsDTO.getContent());
		entity.setThumbnail(newsDTO.getThumbnail());
		entity.setShotDecription(newsDTO.getShotDecription());
		return entity;
	}

}
