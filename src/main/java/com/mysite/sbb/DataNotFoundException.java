package com.mysite.sbb;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND, reason = "entiry not found")
public class DataNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	public DataNotFoundException(String message) {
		super(message);
	}
}

//DataNotFoundException : 특정 엔티티 또는 데이터를 찾을 수 없을 경우 발생하는 예외 클래스
//스프링 부트는 설정된 HTTP 상태 코드(HttpStatus.NOT_FOUND)와 이유를 포함한 응답을 생성하여 클라이언트에게 반환 (404 오류)
//RuntimeException  :  사용자 정의 예외 클래스 생성하기 위해 상속 / 실행시 발생하는 예외