package exercise;

import java.util.Scanner;

public class oddEvenNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter your number:");
		 int x=input.nextInt();
		 
		 if (x%2==0) {
			 System.out.println("This number is even ");
		 }else if (x%2!=0){
			 System.out.println("This number is odd");
		 }

	}

}
