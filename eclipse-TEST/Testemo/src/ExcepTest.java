
public class ExcepTest {
	
	public static void main(String[] args) {
		
		
		try {
		
		int array []=new int[2];

		System.out.println("Access ELement Three "+array[3]);
		
		}catch(ArrayIndexOutOfBoundsException e){
			 
	System.out.println("Exception Found "+e);	
		}
		
		System.out.println("Out of the block");
		}
		
}
