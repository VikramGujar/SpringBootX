package com.vik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.vik.sbeans.MyInfo;

@SpringBootApplication
public class YmlFileDemoApplication {

	public static void main(String[] args) {
		try(
			ConfigurableApplicationContext ctx =
			SpringApplication.run(YmlFileDemoApplication.class, args);)
		{
			MyInfo mi = ctx.getBean("myInfo",MyInfo.class);
			System.out.println(mi);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
