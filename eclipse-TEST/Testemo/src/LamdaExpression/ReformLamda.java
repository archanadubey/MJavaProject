package LamdaExpression;



@FunctionalInterface
interface Cub{
//	void bookCab();
//	void bookCab( String source, String destination);
	double bookCab( String source, String destination);
}


//
// class UberX implements Cub{
//	 public void bookCab() {
//		 System.out.println("UberX booked !! arriving Soon ....");
//	 }
// }
public class ReformLamda {
	public static void main(String[] args) {
		
	
	
//	Cub cub =new UberX();
//	cub.bookCab();

	// Annonimous Class implemention 
//		Cub cab =new Cub() {
//			
//			@Override
//			
//			public void bookCab() {
//				
//				System.out.println("UberX booked!! Arrving Soon ");
//				
//				
//			}
//		};
//		cab.bookCab();
		// LamdaExpression 
		Cub cab =(source,destination)->{
			
			System.out.println("UberX Booked !!"+source+" Arriving Soon...."+destination);
			return 876.43;
		};
		
		double fare=cab.bookCab("San","Ramon");
		System.out.println(fare +"Total paid Surface");
		
		
	}
	
	

}
