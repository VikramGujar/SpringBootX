package com.vik;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.vik.sbeans.WishMessageGenrator;

@SpringBootApplication
public class DependencyInjectionViaConstructorApplication {

	@Bean(name = "lt")
	public LocalTime getTime()
	{
		return LocalTime.now();
	}
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionViaConstructorApplication.class, args);
		WishMessageGenrator wmg = ctx.getBean("wmg",WishMessageGenrator.class);
		String retult = wmg.getWishMessage("Vikram");
		System.out.println(retult);
		((ConfigurableApplicationContext) ctx).close();
	}

}
