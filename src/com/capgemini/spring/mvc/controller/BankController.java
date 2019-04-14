package com.capgemini.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.capgemini.spring.mvc.entity.BankAccount;
import com.capgemini.spring.mvc.exception.AccountNotFoundException;
import com.capgemini.spring.mvc.exception.LowBalanceException;
import com.capgemini.spring.mvc.service.BankAccountService;

@Controller
@RequestMapping("/mumbaibank")
public class BankController {

		@Autowired
		private BankAccountService service;
		
		
		@RequestMapping("/")
		public String inputPage() {
			
			return "update";
		}
		
		@RequestMapping("/new")
		public String addNewPerson(@RequestParam("personName") String accountHolderName , @RequestParam("accountType") String accountType, @RequestParam("accountBal") 
										double accountBalance) {
			
			service.addNewBankAccount(new BankAccount( accountHolderName,  accountType,  accountBalance));
			
			return "success";
			
		}
		
		@RequestMapping("/remove")
		public String deleteAccount(@RequestParam("accountId") long accountId) throws AccountNotFoundException {
			
			service.deleteBankAccount(accountId);
			
			return "success";
			
		}
		
		@RequestMapping("/addmoney")
		public String deposit(@RequestParam("accountId") long accountId, @RequestParam("amount") double amount ) throws AccountNotFoundException {
			
			service.deposit(accountId, amount);
			
			return "success";
			
		}
		
		@RequestMapping("/deduct")
		public String withdraw(@RequestParam("accountId") long accountId, @RequestParam("amount") double amount ) throws AccountNotFoundException, LowBalanceException {
			
			service.withdraw(accountId, amount);
			
			return "success";
			
		}
		
		@RequestMapping("/check")
		public String checkBalance(@RequestParam("accountId") long accountId) throws AccountNotFoundException{
			
			double balance = service.checkBalance(accountId);
			System.out.println(balance);
			return "success";
			
		}
		
		@RequestMapping("/findaccounts")
		public String findAccounts(){
			
			service.findAllBankAccountsDetails();
			return "search";
			
		}
		
		@RequestMapping("/fundtransfer")
		public String fundTransfer(@RequestParam("senderAccountId") long fromAccount, @RequestParam("RecieverAccountId") long toAccount, @RequestParam("amount") double amount) throws AccountNotFoundException, LowBalanceException{
			
			service.fundTransfer(fromAccount, toAccount, amount);
			return "success";
			
		}
		
		@RequestMapping("/updatedetails")
		public String fundTransfer(@RequestParam("accountId") long accountId, @RequestParam("accountHolderName") String accountHolderName, @RequestParam("accountType") String accountType) throws AccountNotFoundException, LowBalanceException{
			
			service.updateBankAccountDetails(accountId, accountHolderName, accountType);
			return "success";
			
		}
		
		
		

	}

