package com.mysite.sbb;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HelloLombok {
	private String hello;
	private int lombok;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloLombok helloLombok = new HelloLombok();
		helloLombok.setHello("hello");
		helloLombok.setLombok(5);
		
		System.out.println(helloLombok.getHello());
		System.out.println(helloLombok.getLombok());
	}
}
