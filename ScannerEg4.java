// Program for the sum of even number from 1 to user given number.
import java.util.Scanner;
public class ScannerEg4 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int i1 = sc.nextInt();
		int sum =0;
		
		for (int i=1; i<=i1; i++) 
		{
			if (i%2==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("Sum of Even Number is "+sum);

	}

}
