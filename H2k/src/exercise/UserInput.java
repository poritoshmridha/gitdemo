package exercise;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		int number;
		System.out.print("Enter a number :");
		
		
		number= input.nextInt();
		
		
		System.out.println("The number you entered is :" +number);

	}

}
