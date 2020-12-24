package String.pacBignnersBooks;

public class DemoConstructor  {
	
	int empId;
	String empName;
	
	
	
	DemoConstructor(int id, String name){
		this.empId=id;
		this.empName=name;
	}
	
	void info () {
		
		System.out.println("Id="+empId+" Name ="+empName);
	}
	
	
	public static void main(String[] args) {
		
		DemoConstructor obj =new DemoConstructor(10002,"Archana");
		
		DemoConstructor obj2=new DemoConstructor(10004,"Parnavi"); 
		
		obj.info();
		obj2.info();
	}
	
}
