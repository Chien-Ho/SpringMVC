package com.aptech.controller.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aptech.dto.NewsDTO;
import com.aptech.service.INewsService;

@RestController

public class NewsAPI {
	@Autowired
	private INewsService newsService;
@PostMapping("/api/news")
public NewsDTO insertNews(@RequestBody NewsDTO newsDTO) {
	
	return newsService.save(newsDTO);
	
}
@PutMapping("/api/news")
public NewsDTO updateNews(@RequestBody NewsDTO updateDTO) {
	
	return newsService.save(updateDTO);
	
}
@DeleteMapping("/api/news")
public void deleteNews(@RequestBody Long[] ids) {
	 newsService.delete(ids);
}
}
