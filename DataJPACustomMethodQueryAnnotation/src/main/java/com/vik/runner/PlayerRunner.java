package com.vik.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vik.entity.Player;
import com.vik.service.IPlayerDBService;
@Component
public class PlayerRunner implements CommandLineRunner {

	@Autowired
	IPlayerDBService plsv;
	
	@Override
	public void run(String... args) throws Exception {
		


	}

}
