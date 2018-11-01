package com.bank.components;

import org.springframework.stereotype.Controller;

@Controller
public class SavingAccount implements CreateAccount {

	@Override
	public void createAcc() {
		System.out.println("Saving Account Created");
	}

}
