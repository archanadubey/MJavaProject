package Edureka1;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu {
	Scanner menuInput= new Scanner(System.in);
	DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
	
	
	HashMap<Integer,Integer> data=new HashMap<Integer,Integer>();
	
	//validate login Information customer number and pin ///
	
	public void getLogin() throws IOException{
		int x=1;
		do {
			try {
				
				data.put(9876543,9876);
				data.put(8989898,1890);
	
				
				System.out.println("Welcome to the ATM Project:");
				
				System.out.println("Enter your Customer Number");		
			}
		}
		
	}
	
	
	
	
}
