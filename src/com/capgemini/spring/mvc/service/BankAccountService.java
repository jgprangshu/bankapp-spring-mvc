package com.capgemini.spring.mvc.service;

import java.util.List;

import com.capgemini.spring.mvc.entity.BankAccount;
import com.capgemini.spring.mvc.exception.AccountNotFoundException;
import com.capgemini.spring.mvc.exception.LowBalanceException;

public interface BankAccountService {
	
	public double checkBalance(long accountId) throws AccountNotFoundException;

	public double withdraw(long accountId, double amount) throws AccountNotFoundException, LowBalanceException;

	public double deposit(long accountId, double amount) throws AccountNotFoundException;

	public boolean deleteBankAccount(long accountId) throws AccountNotFoundException;

	public boolean addNewBankAccount(BankAccount account);

	public List<BankAccount> findAllBankAccountsDetails();

	public BankAccount searchAccountDetails(long accountId) throws AccountNotFoundException;

	public double fundTransfer(long fromAccount, long toAccount, double amount)throws AccountNotFoundException, LowBalanceException;

	public boolean updateBankAccountDetails(long accountId, String accountHolderName, String accountType);

}
