package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController2 {
	@GetMapping("/sbb") //http://localhost:8080/sbb
	@ResponseBody
	public String index() {
//		System.out.println("index");
		return "inde1x";
	}
}
