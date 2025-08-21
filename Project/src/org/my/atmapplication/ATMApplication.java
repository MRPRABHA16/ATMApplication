package org.my.atmapplication;

public interface ATMApplication
{
	public void deposite(double amount);
	public void withdraw(double amount);
	public void checkBalance();
	public boolean Login(long atmNo, int pin);
	public void changePin(int pin);
}

