package exercise;

public class PrintAverageOfNumber {

	public static void main(String[] args) {
		
		
		float a=0f;
		float b=1f;
		do {
			
			a+=b;
			b++;
		}
		while(b<51);
		
		float c=a/50;
		System.out.println("The average of the 50 natural number is:" +c);
	}

}
