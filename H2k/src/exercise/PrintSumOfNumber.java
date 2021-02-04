package exercise;

public class PrintSumOfNumber {

	public static void main(String[] args) {
		
		int num=100,count=1,total=0;
		while( count<=num)
		{
			total = total+count;
			count++;
		}
		
		System.out.println("The sum of the first 10 natural number ia:" +total);
	}

}
