// Program to find the sum of number of user given range and check the sum is even
// or odd if it is even print its table, if odd just print the sum.
import java.util.Scanner;
public class ScannerEg10 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Starting Value");
		int start = sc.nextInt();
		System.out.println("Enter Ending Value");
		int end = sc.nextInt();
		
		int sum = 0;
		if(start>end)  //----------------------Swapping Statement
		{
			int temp=start;
			start=end;
			end=temp;
		}
//--------------------------------------------------Condition for Addition	
		for (		; start<=end; start++) 
		{
			sum=sum+start;
		}
		System.out.println("Sum of the values is ---> "+sum);
//--------------------------------------------------Condition for Even and Odd	
		if(sum%2==0)
		{
			for (int i = 1; i<=10; i++)
			{
				System.out.println(sum+" X "+i+" = "+(sum*i));
			}
		}
		else
		{
			System.out.println("Sum of the values is ---> "+sum);
		}
	}
}
