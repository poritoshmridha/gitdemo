package exercise;

import java.util.Scanner;

public class InterestCalculation {

	public static void main(String[] args) {
	
		Scanner input= new Scanner(System.in);
		
		Double p;
		Double r;
		Double t;
		
		System.out.print("Enter principal:");
		p= input.nextDouble();
		System.out.print("Enter interest rate:");
		r= input.nextDouble();
		System.out.print("Enter time:");
		t= input.nextDouble();
		Double a;
		a= p*(Math.pow((1+r), t));
		System.out.println("The total amount is:" +a);
		
		

	}

}
