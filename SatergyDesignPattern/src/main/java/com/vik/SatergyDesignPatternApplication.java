package com.vik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.vik.sbeans.CricketTeam;

@SpringBootApplication
@ImportResource("com/vik/cnfg/applicationContext.xml")
public class SatergyDesignPatternApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SatergyDesignPatternApplication.class, args);
		
		CricketTeam ct = ctx.getBean("ct",CricketTeam.class);
		ct.play("Virat");
		((ConfigurableApplicationContext) ctx).close();
	}

}
