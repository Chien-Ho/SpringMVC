package com.aptech.controller.API;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class API {
	@PostMapping("/api")
	public String Simple() {
		
		return "hello word";
	}

}
