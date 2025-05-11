package com.vik.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vik.config.AppConfig;
import com.vik.sbeans.HelloSpringBoot;

public class HelloMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		HelloSpringBoot hello = ctx.getBean("hsb",HelloSpringBoot.class);
		hello.greeting();
		ctx.close();

	}

}
