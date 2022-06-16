package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {
	
	@RequestMapping("/hi")
	@ResponseBody
	public String Sayhello()
	{
		return ("hellol");
	}

}
