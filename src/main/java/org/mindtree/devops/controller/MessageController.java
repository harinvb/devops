package org.mindtree.devops.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
	
	@RequestMapping("/")
	public String version() {
		return "0.0.1";
	}

}
