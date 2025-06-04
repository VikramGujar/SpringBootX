package com.vik.service;

import java.util.Optional;

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


	@Override
	public String withdrawMoney(Long accNo, Double ammount) {
		Optional<BanckAccount> opt = bank.findById(accNo);
		if(opt.isPresent())
		{
			BanckAccount banckAccount = opt.get();
			banckAccount.setAccountBalence(banckAccount.getAccountBalence()-ammount);
			System.out.println("Account Balance is :: "+banckAccount.getAccountBalence());
			bank.save(banckAccount);
			return ammount+" debited from bank account";
		}else
		return "Account Not Found ";
	}

}
