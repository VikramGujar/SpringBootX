package com.vik.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vik.entity.BanckAccount;
import com.vik.repository.IBackAccountRepository;

@Service
public class BankAccImpl implements IBankAccountService {

	@Autowired
	IBackAccountRepository bank;
	
	
	@Override
	public String createAccount(BanckAccount acc) {
		BanckAccount bankAcc = bank.save(acc);
		
		return "Bank account created with details :: "+bankAcc;
	}

}
