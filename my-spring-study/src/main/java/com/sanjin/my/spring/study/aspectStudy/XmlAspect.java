package com.sanjin.my.spring.study.aspectStudy;


/**
 * @author: sanjin
 * @date: 2020/1/12 下午1:36
 */
public class XmlAspect {
	public void before() {
		System.out.println("execute before method,pointcut=");
	}

	public void after() {
		System.out.println("execute after method,pointcut=");
	}

	public void around() throws Throwable {
		System.out.println("execute around method,pointcut=");
	}

	public Object afterReturn(Object ret) {
		System.out.println("execute afterReturn method,pointcut=" + ret);
		return ret;
	}

	public void throwException(Exception ex) {

		System.out.println("execute throwException method,pointcut=" + ex);
	}
}
