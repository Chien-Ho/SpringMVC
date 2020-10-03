package com.aptech.converter;

import org.springframework.stereotype.Component;

import com.aptech.dto.CategoryDTO;
import com.aptech.entity.CategoryEntity;
@Component
public class CategoryConverter {
	public CategoryDTO toDto(CategoryEntity categoryEntity) {
		CategoryDTO categoryDTO = new CategoryDTO();
		categoryDTO.setCode(categoryEntity.getCode());
		categoryDTO.setName(categoryEntity.getName());
		return categoryDTO;
	}

}
