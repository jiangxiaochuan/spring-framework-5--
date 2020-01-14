package com.sanjin.my.spring.study.common.service;

import com.sanjin.my.spring.study.aspectStudy.XmlAspect;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * @author: sanjin
 * @date: 2020/1/12 上午10:21
 */
public class HelloService implements ApplicationListener<ContextRefreshedEvent>, InstantiationAwareBeanPostProcessor {

	@Autowired
	private XmlAspect xmlAspect;

	private String aaa;

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

	public String getAaa() {
		return aaa;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		this.aaa = "hahahahahha";
		return true;
	}
}
