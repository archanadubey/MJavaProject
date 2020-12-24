package String.pacBignnersBooks;

import java.util.Scanner;

public class IsVowel {
	
	public static void main(String[] args) {
		boolean isVowel=false;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Charector: ");
		
		char ch=sc.next().charAt(0);
		
		sc.close();
		
		switch(ch) {
			
		
			case 'a':
			case 'e':
			case 'i':
			case 'u':
			case 'o':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U': isVowel=true;
			
		}
		if(isVowel==true) {
			
			System.out.println(ch+"char is vowel");
		}else {
			if(ch>='a'&& ch<='z'||ch>='A'&&ch<='Z') {
				System.out.println(ch+" char is consonent");
				
			}else 
				System.out.println("Entered char not an Alphabet");
		}
		
		
	}

}
