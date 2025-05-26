package com.vik;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.vik.sbeans.DignosticCenterPrizing;

@SpringBootApplication
@PropertySource("com/vik/commons/info.properties")
public class SpelDemoApplication {

	public static void main(String[] args) {
	   ConfigurableApplicationContext ctx = SpringApplication.run(SpelDemoApplication.class, args);
	   DignosticCenterPrizing dcp = ctx.getBean("dcp",DignosticCenterPrizing.class);
	   System.out.println(dcp);
	   
	   ctx.close();
	}

}
