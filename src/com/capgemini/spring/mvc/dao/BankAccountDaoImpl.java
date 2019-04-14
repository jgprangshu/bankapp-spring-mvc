package com.capgemini.spring.mvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.capgemini.spring.mvc.entity.BankAccount;
import com.capgemini.spring.mvc.exception.AccountNotFoundException;

@Repository
public class BankAccountDaoImpl implements BankAccountDao{
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public BankAccountDaoImpl(JdbcTemplate jdbcTemplate){
		
		 this.jdbcTemplate = jdbcTemplate; 
	}

	


	@Override
	public double getBalance(long accountId) {
		String query = "SELECT account_balance FROM bankaccounts WHERE account_id=" + accountId;
		double balance;
		balance=jdbcTemplate.queryForObject(query,Double.class);
		//System.out.println(balance);
		return balance;
	}

	@Override
	public void updateBalance(long accountId, double newBalance) {
		String query = "UPDATE bankaccounts SET account_balance='"+newBalance+"' WHERE account_id='"+accountId+"' ";
		jdbcTemplate.update(query);
		
	}

	@Override
	public boolean deleteBankAccount(long accountId) {
		String query = "DELETE FROM bankaccounts WHERE account_id=" + accountId;
		int result=jdbcTemplate.update(query);
		if(result>0){
			return true;
		}else{
			return false;
		}
	}


	@Override
	public boolean addNewBankAccount(BankAccount account) {

		String query = "INSERT INTO bankaccounts (customer_name,account_type,account_balance) VALUES ('"+account.getAccountHolderName()+"','"+account.getAccountType()+"','"+account.getAccountBalance()+"')";
		int result=jdbcTemplate.update(query);
		if(result>0){
			return true;
		}else{
			return false;
		}
	}


	@Override
	public List<BankAccount> findAllBankAccountsDetails() {
		String query = "SELECT * FROM bankaccounts";	
		return jdbcTemplate.query(query,(rs,rowNum)->getAccount(rs));
	}

	@Override
	public BankAccount searchAccountDetails(long accountId) throws AccountNotFoundException {
		String query = "SELECT * FROM bankaccounts WHERE account_id=" + accountId;
		BankAccount account=null;
		try {
			account=jdbcTemplate.queryForObject(query,(rs,rowNum)->getAccount(rs));
		}
		catch(EmptyResultDataAccessException e) {
			//e.printStackTrace();
		}	
		return account;
	}

	@Override
	public boolean updateBankAccountDetails(long accountId, String accountHolderName, String accountType) {

		String query = "UPDATE bankaccounts SET customer_name='"+accountHolderName+"',account_type='"+accountType+"' WHERE account_id='"+accountId+"' ";

			int result = jdbcTemplate.update(query);

			if(result>0){
				return true;
			}else{
				return false;
			}
	}

	public BankAccount getAccount(ResultSet rs) throws SQLException {
		BankAccount account= new BankAccount();
		account.setAccountBalance(rs.getDouble(4));
		account.setAccountId(rs.getInt(1));
		account.setAccountHolderName(rs.getString(2));
		account.setAccountType(rs.getString(3));
		return account;
	}	

}
