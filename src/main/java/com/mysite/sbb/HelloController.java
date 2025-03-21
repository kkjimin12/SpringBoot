package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@GetMapping("/hello")
	@ResponseBody //hello 메서드의 출력값을 그대로 리턴
	public String hello() {
		return "Hello Sbd!!!";
	}
}
