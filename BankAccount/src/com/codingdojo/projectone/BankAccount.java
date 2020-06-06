package com.codingdojo.projectone;
import java.util.Random;
public class BankAccount {
	private String checkingnum;
	private String savingsnum;
	private double checkingbal;
	private double savingsbal;
	private static int acctcount;
	private static double totalbal;
	
	private String accountNumGenerator() {
		String randacct = "";
		Random r = new Random();
		for (int i=1;i<=10;i++) {
			randacct+=Integer.toString(r.nextInt(10));
		}
		return randacct;
	}// use acctcount in the beginning or end of the 10-digit string to make sure account number is unique
	
	public BankAccount(double camt, double samt) {
		this.checkingnum = accountNumGenerator();
		this.savingsnum = accountNumGenerator();
		this.checkingbal = camt;
		this.savingsbal = samt;
		acctcount+=2;
		totalbal+=camt;
		totalbal+=samt;
	}

	public double getCheckingbal() {
		System.out.println("Account " + this.checkingnum + " has " + this.checkingbal + " in checking");
		return this.checkingbal;
	}

	public double getSavingsbal() {
		System.out.println("Account " + this.savingsnum + " has " + this.savingsbal + " in savings");
		return this.savingsbal;
	}

	public void makeDeposit(double amount, char type) {
		if (type == 'c') {
			this.checkingbal+=amount;
			totalbal+=amount;
		} else if (type == 's') {
			this.savingsbal+=amount;
			totalbal+=amount;
		}
	}
	
	public void withdrawMoney(double amount, char type) {
		if (type == 'c' && this.checkingbal >= amount) {
			this.checkingbal-=amount;
			totalbal-=amount;
		} else if (type == 's' && this.savingsbal >= amount) {
			this.savingsbal-=amount;
			totalbal-=amount;
		}
	}
	
	public static void displayBankFund() {
		System.out.println("Current bank fund: " + totalbal);
	}
	
	public static void displayAccountCount() {
		System.out.println("Total number of accounts: " + acctcount);
	}
	
	
}
