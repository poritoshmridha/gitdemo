package exercise;

import java.util.Scanner;

public class EmiCalculation {

	public static void main(String[] args) {

             Scanner input= new Scanner(System.in);
             
             double p;
             double r;
             double n;
             System.out.print(" Enter your pricipal loan amount:");
             p= input.nextDouble();
             
             System.out.print(" Enter your rate:");
             r= input.nextDouble();
             
             
             System.out.print(" Enter your loan term:");
             n= input.nextDouble();
             
             double c= (r/12/100);
             double rate= 1+c;
             double a= Math.pow(rate, n);
             double b= c*(a/(a-1));
             double e= b*p;
             
             System.out.println(" Your e is:" +e);
             
             

		
		
		
		
	}

}
