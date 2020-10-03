package com.aptech.controller.admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.aptech.dto.NewsDTO;
import com.aptech.service.ICategoryService;
import com.aptech.service.INewsService;

@Controller
public class NewsController {
	@Autowired
	private INewsService newsService;
	@Autowired
	private ICategoryService categoryService;
	@RequestMapping(value = "/admin/list", method = RequestMethod.GET)
	public ModelAndView listPage(@RequestParam("page") int page, @RequestParam("limit") int limit,
			HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("admin/list");
		NewsDTO model = new NewsDTO();
		model.setPage(page);
		model.setLimit(limit);
		Pageable pageable = new PageRequest(page - 1, limit);
		model.setListResult(newsService.findAll(pageable));
		model.setTotalItem(newsService.getTotalItem());
		model.setTotalPage((int) Math.ceil(model.getTotalItem()/model.getLimit()));
		mav.addObject("model", model);
		return mav;
		
	}
	@RequestMapping(value = "/admin/edit", method = RequestMethod.GET)
	public ModelAndView editPage(@RequestParam(value = "id", required = false) Long id, HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("admin/edit");
		NewsDTO model = new NewsDTO();
		
		if(id != null) {
			model = newsService.findOneById(id);
	}
		

		mav.addObject("categories", categoryService.findAll());
		mav.addObject("model", model);
		
		
		return mav;
		
	}
	
	
}

