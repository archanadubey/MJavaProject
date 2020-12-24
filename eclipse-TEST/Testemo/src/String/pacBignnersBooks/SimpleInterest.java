package String.pacBignnersBooks;

import java.util.Scanner;

public class SimpleInterest {
	
	public static void main(String[] args) {
		float p,r,t,sinterest;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Principle : ");
		
		 p =sc.nextFloat();
		 System.out.println("Enter the rate : ");
		 r=sc.nextFloat();
		 
		 System.out.println("Enter the time : " );
		 t=sc.nextFloat();
		 
		 sinterest=(p*r*t)/100;
		 System.out.println(sinterest);
		 
	}

}
