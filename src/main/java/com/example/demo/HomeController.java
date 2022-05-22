package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@ResponseBody
	@RequestMapping("/index")
	public String sayHello() {
		System.out.print("Hello World Again");
		
		return "Hello Docker and AWS with Jenkins , Github";	}

}
