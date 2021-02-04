package exercise;

import java.util.Scanner;

public class OneToTen {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in );
		byte x;
		System.out.print("Enter any number from 1 to 10:");
		x= input.nextByte();
		
		if (x==1) {
			System.out.print("one");
		}else if (x==2) {
			System.out.print("two");
			
		}else if (x==3) {
			System.out.print("three");
			
		}else if (x==4) {
			System.out.print("four");
			
		}else if (x==5) {
			
			System.out.println("five");
			
		}else if (x==6) {
			System.out.print("six");
			
		}else if (x==7) {
			System.out.print("seven");
			
		}else if (x==8) {
			
			System.out.print("eight");
			
				
			}else if (x==9) {
				System.out.print("nine");
				
				
			}else if (x==10) {
				System.out.print("ten");
				
			}else {
				System.out.println("This is not within range");
			}
	}

}
