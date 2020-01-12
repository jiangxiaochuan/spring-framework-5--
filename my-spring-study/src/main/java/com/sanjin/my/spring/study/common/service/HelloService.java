package com.sanjin.my.spring.study.common.service;

/**
 * @author: sanjin
 * @date: 2020/1/12 上午10:21
 */
public class HelloService {
	public String sayHello(String name) {
		if (name.equals("a"))
			throw new RuntimeException("aaa");
		return "Hello, " + name;
	}
}
