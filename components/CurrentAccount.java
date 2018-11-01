package com.bank.components;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

@Controller
@Primary
public class CurrentAccount implements CreateAccount {

	@Override
	public void createAcc() {
		System.out.println("Current Account Created");
	}

}
