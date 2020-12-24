package packDemo;

public class numrev {
	public static void main(String[] args) {
		int num=234;
		
		int rev =0;
		
		while (num>0) {
			
			int digit=num%10;
			//int rem= rem +num;
			rev =rev*10+digit;
			
			
			
			num=num*10;
			
			
			
			
//		int 	num1=num%10;
//			//reminder=reminder+num;
//			rev= rev*10+num1;
//			
//		num=num/10;			
	}
		System.out.println(rev);
	}
}
