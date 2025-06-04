package com.vik.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vik.entity.BanckAccount;
import com.vik.service.IBankAccountService;

@Component
public class BankRunner implements CommandLineRunner {

	@Autowired
	IBankAccountService bnkSer;
	
	@Override
	public void run(String... args) throws Exception {
		/*
		BanckAccount b1 = new BanckAccount("Ravi", "HYB", 90000.00, "Bank Of Telangana");
		String msg = bnkSer.createAccount(b1);
		System.out.println(msg);
		*/
		
		String msg = bnkSer.withdrawMoney(100000000L, 30000.0);
		System.out.println(msg);
		
		

	}

}
