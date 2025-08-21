package org.my.atmapplication;

public class ATM implements ATMApplication 
{
	int pin;
	long atmNo;
	double balance;
	ATM(int pin, double balance, long atmNo)
	{
		this.pin=pin;
		this.atmNo=atmNo;
		this.balance=balance;
	}
	@Override
	public void deposite(double amount) {
		balance +=amount;
		System.out.println(amount+" Amount Credit Successfully");
	}
	@Override
	public void withdraw(double amount) {
		if(amount < balance)
		{
			balance -= amount;
			System.out.println(amount+" Amount Debit Successfully");
		}else
			System.out.println("Insufficient balance");
	}
	@Override
	public void checkBalance() {
		System.out.println("You Account Balance is:"+balance);
	}
	@Override
	public boolean Login(long atmNo, int pin) {
		if(this.atmNo == atmNo)
		{
			if(this.pin == pin)
			{
				return true;
			}
			else
			{
				System.out.println("Invalid pin");
			}
		}
		else
		{
			System.out.println("Invalid atm number");
		}
		return false;
	}
	@Override
	public void changePin(int pin) {
		this.pin=pin;
	}
}
