package com.mysite.sbb;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class HelloLombok3 {
	private final String hello;
	private final int lombok;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloLombok3 helloLombok3 = new HelloLombok3("hello",5);
		System.out.println(helloLombok3.getHello());
		System.out.println(helloLombok3.getLombok());

	}

}
