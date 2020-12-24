package String;

public class SubString {
	
	public static void main(String[] args) {
		
		String str1="Programe";
		System.out.println(str1.substring(0,3));
		
		System.out.println(str1.substring(0));
		System.out.println(str1.substring(3));
		
		// equals IgnoreCase
		
		String str2="Learn Java";
		String str3="Learn JAVA";
		String Str4="Learn Method ";
		
		System.out.println(str2.equalsIgnoreCase(str3));
		
		// value are not equal :---
		System.out.println(str3.equalsIgnoreCase(Str4));
		if(Str4.equalsIgnoreCase(str3)) {
			System.out.println("str2 and str3 are equals ");
			
		}else
			System.out.println("str2 and str3 are not equals");
		
		int result;
		result= str2.indexOf('J');
		System.out.println(result);
		System.out.println(str2.trim());
		
		result= str3.indexOf('A');
		System.out.println("Index of A = "+result);
		
		
		
	}

}
