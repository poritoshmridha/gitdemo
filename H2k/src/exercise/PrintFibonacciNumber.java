package exercise;

import java.util.Scanner;

public class PrintFibonacciNumber {

	public static void main(String[] args) {
		

		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter the fruit name:");
		
		String a= input.nextLine();
		switch (a) {
		case "banana":
			System.out.println("This fruit color is yellow:");
			break;
		case "berry":
			System.out.println("This fruit color is balck:");
			break;
		case "strawberry":
			System.out.println("This fruit color is red:");
			break;
		case "peach":
			System.out.println("This fruit color is pinkish yellow:");
			break;
		case "mango":
			System.out.println("This fruit color is yellow or orange:");
			break;
		case "orange":
			System.out.println("This fruit color is yellow:");
			break;
			default:
				System.out.println("This is not a fruit");
		}
	}

}
