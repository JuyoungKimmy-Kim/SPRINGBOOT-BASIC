package com.mycom.basic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class BasicController {
	
	@RequestMapping(value="/")
	public String home () {	
		return "home";
	}
}
