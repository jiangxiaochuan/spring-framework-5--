package com.sanjin.my.spring.study.common.service;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * @author: sanjin
 * @date: 2020/1/12 上午10:21
 */
public class HelloService implements ApplicationListener<ContextRefreshedEvent> {
	public String sayHello(String name) {
		if (name.equals("a"))
			throw new RuntimeException("aaa");
		return "Hello, " + name;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println("onApplicationEvent触发事件...");
		System.out.println(event);
	}
}
