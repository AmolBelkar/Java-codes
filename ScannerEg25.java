// Program to find the sum of prime number form user given range
import java.util.Scanner;
public class ScannerEg25 {

	public static void main(String[] args) {
		
		Scanner str = new Scanner (System.in);
		System.out.println("Enter the Starting Value");
		int start = str.nextInt();
		
		Scanner en = new Scanner (System.in);
		System.out.println("Enter the Ending Value");
		int end = en.nextInt();
		
		int sum = 0;
		int count = 0;
		int i = 2;

		while(start<=end)
		{
			
		while(start>=i)
		{
			if(start%i==0)
			{
				break;
			}
			i++;
		}	
			if(start==i)
			{
				sum = sum + start;
			}
			start++;
		System.out.println(sum);
	}
}
}
