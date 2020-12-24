package String;

import java.util.Arrays;

public class LengthString {
	
	
	public static void main(String[] args) {
		
		String greet="Hellow World";
		int Length= greet.length();
		System.out.println("Length of the String are: "+Length);
		
		// Spiting the String :-
		String vowels="a::b::c::d::d:e";
		String [] result=vowels.split("::");
		System.out.println("String result" + Arrays.toString(result));
		
		// String Concatenation
		
	String name="Archana";
	String name1="Dubey";
	String bothConcatinate=greet.concat(name);
	System.out.println(bothConcatinate);
	
	// Compairing two String by equals()
	boolean results= name.equals(name1);
	System.out.println(name);
	System.out.println(name1);
	System.out.println("Check equals or not: "+results);
	
	
		
		
	} 
	
	
	
	
	

}
