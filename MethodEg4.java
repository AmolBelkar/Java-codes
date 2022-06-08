// Program to find the Prime number from user given range.
import java.util.Scanner;
public class MethodEg4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Starting Value");
		int start = sc.nextInt();
		System.out.println("Enter Ending Value");
		int end = sc.nextInt();
		int sum = 0;
		
		while(start<=end)
		{
			prime(start);
			sum = sum+start;     // Takes sum from starting value to ending value. 
			start++;     
		}
		System.out.println(sum);
	}
	public static void prime(int a)
	{
		int i = 2;
		while(a>=i)
		{
			if(a%i==0)
			{
				break;
			}
			i++;
		}
		if(a==i)
		{
			System.out.println(a+" Is A Prime Number");
		}
	}
}
