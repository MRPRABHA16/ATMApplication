package org.my.atmapplication;

import java.util.Scanner;

public class ATMTest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ATM Number:");
		long atmNo = sc.nextLong();
		
		System.out.println("Enter the Secret Pin:");
		int pin = sc.nextInt();
		
		System.out.println("Enter your Balance:");
		double balance = sc.nextDouble();
		
		ATMApplication atm = new ATM(pin,balance,atmNo);
		
		boolean execution = true , login = true;
		  ,,        do
		{
			System.out.println("Press 1 for Check Balance");
			System.out.println("Press 2 for Deposit");
			System.out.println("Press 3 for Withdraw");
			System.out.println("Press 4 for Login");
			System.out.println("Press 5 for Change Pin");
			System.out.println("Press 0 for Exit");
		
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1:
					if(login)
						atm.checkBalance();
					else {
						System.out.println("Please do Login Again:");
					}
					break;
					
				case 2:
					if(login)
					{
						System.out.println("Enter the Amount:");
						double amount = sc.nextDouble();
						if(amount % 100 == 0)
							atm.deposite(amount);
						else
							System.out.println("Enter the valid Amount:");
					}
					else
					{
						System.out.println("Please do Login Again");
					}
					break;
					
				case 3:
					if(login)
					{
						System.out.println("Enter Amount:");
						double amount = sc.nextDouble();
						if(amount % 100 == 0)
							atm.withdraw(amount);
						else
							System.out.println("Enter the valid Amount:");
					}
					else
					{
						System.out.println("Please do Login Again");
					}
					break;
					
				case 4:
				{
					int n = 3;
					while(n>0)
					{
						n--;
						System.out.println("Enter atmm Number:");
						long atmN = sc.nextLong();
						
						System.out.println("Enter Pin:");
						int pinn= sc.nextInt();
						
						if(atm.Login(atmNo, pinn))
						{
							login = true;
							break;
						}
						else
						{
							System.out.println("Login Failed You have "+n+" attments");
						}
					}
				}
				break;
				
				case 5:
				{
					System.out.println("Enter New pin:");
					int pinn = sc.nextInt();
					int n =
							3;
					while(n > 0)
					{
						n--;
						if(((ATM)atm).pin != pinn)
						{
							atm.changePin(pinn);
							System.out.println("Pin is updated");
							break;
						}
						else
						{
							System.out.println("Enter Valid pin You Have "+n+"Attments");
						}
					}
				}
				break;
				
				case 0:
					execution = false;
					System.out.println("Thank ypu For Using The Application");
					break;
					
				default:
					System.out.println("Invalid input");
			}
		}while(execution);
	}

}
