package com.aptech.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aptech.dto.CategoryDTO;
import com.aptech.entity.CategoryEntity;
import com.aptech.repository.CategoryRepository;
import com.aptech.service.ICategoryService;

@Service
public class CategoryService implements ICategoryService {
	@Autowired
	private CategoryRepository categoryRepository;


	@Override
	public List<CategoryDTO> findAll() {
		List<CategoryDTO> categories = new ArrayList<>();
		List<CategoryEntity> categoryEntities = categoryRepository.findAll();
		for (CategoryEntity items : categoryEntities) {
			CategoryDTO categoryDTO = new CategoryDTO();
			categoryDTO.setCode(items.getCode());
			categoryDTO.setName(items.getName());
			categories.add(categoryDTO);
		}
		return categories;
	}

}
