package com.vik;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.vik.sbeans.SessionFinder;

// @SpringBootApplication is the annotation is combination of three annotations
// @SpringBootConfiguration
//  |- To make java class as spring boot configuration class 
// @EnableAutoConfiguration
//  |- To Enable auto configuration 
// @ComponentScan 
//  |- To Configure all the classes in the same package and its base packages 
//	|- which are having stereo type annotation as a spring bean 
@SpringBootApplication
public class DependencyInjectionSessionFinderApplication {

	@Bean(name = "lt")
	public LocalDate getDate()
	{
		System.out.println("@Bean method to create LocalDate Object");
		return LocalDate.now();
	}
	public static void main(String[] args) {
		System.out.println("Main method Strated");
		// run method is a static method of SpringApplication class 
		// run method returns IOC Container 
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionSessionFinderApplication.class, args);
		System.out.println("Container creation Ended");
		SessionFinder finder = ctx.getBean("sessionFinder",SessionFinder.class);
		String result = finder.getSession();
		System.out.println("Result :: "+result);
		((ConfigurableApplicationContext) ctx).close();
		System.out.println("IOC Container closed");
		System.out.println("Main method Ended");
	}

}
