package com.aptech.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.aptech.dto.NewsDTO;

public interface INewsService {
	public List<NewsDTO> findAll(Pageable pageable);
	public int getTotalItem();
	public NewsDTO findOneById(Long id);
	public NewsDTO save(NewsDTO newsDTO);
	public void delete(Long[] ids);

}
