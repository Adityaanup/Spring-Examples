package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.DemoBean;

public class ClientApp {
	
	public static void main(String[] args) {
		
		
		ApplicationContext ctx =new ClassPathXmlApplicationContext("com/spring/cfgs/applicationContext.xml");
		
		DemoBean bean= ctx.getBean("db",DemoBean.class);
		
		System.out.println(bean.generateWishMsg("Raja"));
		
		((AbstractApplicationContext)ctx).close();
	}

}
