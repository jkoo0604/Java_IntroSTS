package com.codingdojo.projectone;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acct1 = new BankAccount(100,0);
		BankAccount acct2 = new BankAccount(50,50);
		BankAccount acct3 = new BankAccount(500,100);
		
		acct1.makeDeposit(20, 'c');
		acct2.makeDeposit(100, 's');
		acct3.withdrawMoney(150, 'c');
		acct1.getCheckingbal();
		acct1.getSavingsbal();
		acct2.getCheckingbal();
		acct2.getSavingsbal();
		acct3.getCheckingbal();
		acct3.getSavingsbal();
		BankAccount.displayAccountCount();
		BankAccount.displayBankFund();
		
		
		
	}

}
