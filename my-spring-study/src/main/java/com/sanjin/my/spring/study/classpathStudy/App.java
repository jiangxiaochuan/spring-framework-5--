package com.sanjin.my.spring.study.classpathStudy;

import com.sanjin.my.spring.study.common.service.HelloService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: sanjin
 * @date: 2020/1/12 上午10:22
 */
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		HelloService bean = context.getBean(HelloService.class);
		System.out.println(bean.sayHello("cao"));
	}
}
