package Training;

public class Dog {

	int legs =4;
	int tail =1;
	String barkSound= "bow.... bow";
	
	public void bark () {
		
		System.out.println("barkSound");
	}
	public void run () {
		System.out.println("running");
	}
	
	public static void main(String[] args) {
		Dog jimmy = new Dog ();

		jimmy.bark();
		jimmy.run();
	}

}
