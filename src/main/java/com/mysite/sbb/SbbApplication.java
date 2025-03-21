package com.mysite.sbb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 스프링 부트 애플리케이션 시작 담당
public class SbbApplication { // 해당 프로젝트 이름 + application

	public static void main(String[] args) {
		SpringApplication.run(SbbApplication.class, args);
	}

}
