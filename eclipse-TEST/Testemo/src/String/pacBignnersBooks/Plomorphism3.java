package String.pacBignnersBooks;

	public class Plomorphism3 extends Polymorphism{
	@Override
	public void sound() {
		System.out.println("meow");
	}
	
	public static void main(String[] args) {
		Polymorphism obj =new Plomorphism3();
		obj.sound();
	}

}
