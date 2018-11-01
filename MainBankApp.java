package com.bank;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bank.components.CreateAccount;

public class MainBankApp {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		CreateAccount createAccount = ctx.getBean(CreateAccount.class);

		createAccount.createAcc();

	}

}
