package Edureka1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	
	Scanner input=new Scanner(System.in);
	DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
	
	//set the customer number
	
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber=customerNumber;
			return customerNumber;
		
	}
	
	
	// Get the customerNumber
	
	
	
	public int getCustomerNumber() {
		return customerNumber;
		
	}
//set the pin number
	public int setPinNumber(int pinNumber) {
		this.pinNumber=pinNumber;
		return pinNumber;
	}
			public int getPinNumber() {
				return pinNumber;
				
				}
			
			// Get checking Account balance 
			
			public double getCheckingBalance() {
				
				return checkingBalance;
			}
			
			
			
			//get Saving Account Balance 
			public double getSavingBalance() {
				
				return savingBalance;
				
			}
			
			//Calculate CHecking Account withdrawl 
			
			
			public double calcCheckingWithdraw(double amount) {
				checkingBalance=(checkingBalance-amount);
				return checkingBalance;
					
				}
			
			//Calcutate Saving Account Balance
			
			public double calcSavingWithdraw(double amount) {
				savingBalance=(savingBalance-amount);
				return savingBalance;
			}
			
			public void getCheckingWithdrawInput() {
				System.out.println("Checking Account Balance"+moneyFormat.format(savingBalance));
				System.out.println("Amount you want to withdraw from Saving Account");
				double amount= input.nextDouble();
				
				
				
				if((savingBalance-amount)>=0) {
					calcSavingWithdraw(amount);
					System.out.println("New Saving Balance :" +savingBalance+"\n");
					
				}else {
					System.out.println("Balance can't be Negative."+"\n");
				}
				
			}
			
			//Customer Checking Account Deposit Input
			 
			public void  getSavingDepositeInput() {
				
				System.out.println("Saving Account Balance : "+moneyFormat.format(savingBalance));
				System.out.print("Amount you Want to deposite from Saving Account :");
				double amount=input.nextDouble();
				
				
				
				if((checkingBalance+amount)>=0) {
					
					calcCheckingDeposit(amount);
					
					System.out.println("New Saving Account Balance "+moneyFormat.format(checkingBalance));
					
				}
				else {
					System.out.println("Balance can't be negative:"+"\n");
			}
			
			}

			
			
			private int customerNumber;
			private int pinNumber;
			private double savingBalance;
			private double checkingBalance;
}
