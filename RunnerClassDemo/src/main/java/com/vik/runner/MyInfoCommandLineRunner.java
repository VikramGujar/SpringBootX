package com.vik.runner;

import com.vik.RunnerClassDemoApplication;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyInfoCommandLineRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("MyInfoCommandLineRunner.run()");
		System.out.println("Command Line Runner Arg Values :: ");
		System.out.println(Arrays.toString(args));

	}

}
