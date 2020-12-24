package String.pacBignnersBooks;

	public class Demo2 {
		
		int empId;
	String empName;
	
	public Demo2(){
	
		
		this.empId=10;
		
	}
	public Demo2(int Id, String name){
	
		
		this.empId=Id;
		this.empName=name;
		
	}
	
	public int getValue() {
		return empId;
		
	}
	
	
	public static void main(String[] args) {
		
		Demo2 obj=new Demo2();
		Demo2 obj2=new Demo2(192,"Archanan");
		//obj2.getValue();
		System.out.println(obj.getValue());
		
		System.out.println(obj2.getValue());
	
		
		}
	}
