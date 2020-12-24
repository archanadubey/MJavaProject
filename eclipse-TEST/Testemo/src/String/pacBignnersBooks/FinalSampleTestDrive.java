package String.pacBignnersBooks;

public class FinalSampleTestDrive {
	
	public static void main(String[] args) {
		
		final FinalSample obj =new FinalSample();
		FinalSample obj2 =new FinalSample();
		FinalSample obj3 =new FinalSample();
		
		obj.setName("Praneel");
		System.out.println(obj.getName());
		obj.setName("Arch");
		System.out.println(obj.getName());
		obj.setAge("6");
		System.out.println(obj.getAge());
		
		
		
		
		obj2.setName("Archana");
		System.out.println(obj2.getName());
		
		//obj3.setName("Archoo");
		
		obj3=obj2;
		System.out.println(obj3.getName());
		
		
		
		//obj=obj2;
		obj2.setAge("40");
		System.out.println(obj2.getAge());
		
		obj3.setAge("30");
		System.out.println(obj3.getAge());
		
	}
	
	

}
