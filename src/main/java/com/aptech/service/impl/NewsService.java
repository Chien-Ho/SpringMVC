package com.aptech.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.aptech.converter.NewsConverter;
import com.aptech.dto.NewsDTO;
import com.aptech.entity.CategoryEntity;
import com.aptech.entity.NewsEntity;
import com.aptech.repository.CategoryRepository;
import com.aptech.repository.NewsRepository;
import com.aptech.service.INewsService;

@Service
public class NewsService implements INewsService {
	@Autowired
	private NewsRepository newsRepository;
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private NewsConverter newsConverter;
	@Override
	public List<NewsDTO> findAll(Pageable pageable) {
		List<NewsDTO> models = new ArrayList<>();
		List<NewsEntity> newsEntites = newsRepository.findAll(pageable).getContent();
		for (NewsEntity items : newsEntites) {
			NewsDTO newsDTO = newsConverter.toDTO(items);
			
			models.add(newsDTO);
			
		}
		return models;
		

	}

	@Override
	public NewsDTO findOneById(Long id) {
		NewsEntity newsEntity = newsRepository.findOne(id);
		return newsConverter.toDTO(newsEntity);

	}

	@Override
	public int getTotalItem() {
		return (int) newsRepository.count();
	}

	@Override
	public NewsDTO save(NewsDTO newsDTO) {
		
		CategoryEntity categoryEntity = categoryRepository.findOneByCode(newsDTO.getCategoryCode());
		
		if(newsDTO.getId() != null) {
			NewsEntity oldEntity = newsRepository.findOneById(newsDTO.getId());
			NewsEntity newsEntity = newsConverter.toEntity(newsDTO, oldEntity);
			newsEntity.setCategory(categoryEntity);
			return newsConverter.toDTO(newsRepository.save(newsEntity));
			
		}else {
			NewsEntity newsEntity = new NewsEntity();
			newsEntity =  newsConverter.toEntity(newsDTO, newsEntity);
			newsEntity.setCategory(categoryEntity);
			return newsConverter.toDTO(newsRepository.save(newsEntity));
		}
	}

	@Override
	public void delete(Long[] ids) {
		for(Long id : ids ) {
			newsRepository.delete(id);
		}
		
	}

	

}
