package exercise;

import java.util.Scanner;

public class FarenheitToCelcius {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		double f;
		System.out.print("Enter the temperature in farenheit :");
		f= input.nextDouble();
		double c;
		c= ((5*(f-32.0)/9.0));
		
		System.out.println(" Your temperatyre in celcius :" +c);
		
		
		

	}

}
