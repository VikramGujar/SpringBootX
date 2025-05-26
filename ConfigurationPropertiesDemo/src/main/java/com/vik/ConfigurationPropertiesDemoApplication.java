package com.vik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.vik.sbeans.PersonDetails;

@SpringBootApplication
public class ConfigurationPropertiesDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(ConfigurationPropertiesDemoApplication.class, args);
		PersonDetails pd = ctx.getBean("pd",PersonDetails.class);
		System.out.println(pd);
		ctx.close();
	}

}
