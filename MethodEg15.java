// Design Method to count prime number in the range by using method and check the count 
// is prime or not.
import java.util.Scanner;
public class MethodEg15 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Starting Value");
		int start = sc.nextInt();
		System.out.println("Enter The Ending Value");
		int end = sc.nextInt();
		int count = 0;
		int sum = 0;
		while(start<=end)
		{
			boolean res = prime(start);
//			if(res==true)
			if(res)// Because if accepts the true and false values directly,
			{
				System.out.println("Prime Number Is "+start);
				count++;
				sum = sum + start;
			}
			start++;
		}
		System.out.println(sum);
//		System.out.println("Count Of Prime Is "+count);
		
//		boolean result = prime(count);
//		if(result==true)
		if(prime(count))
		{
			System.out.println("Count Is Prime");
		}
		else
		{
			System.out.println("Count Is Not Prime");
		}
	}
	
	public static boolean prime(int a) 
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
			return true;
		}
		else
		{
			return false;
		}
	}
}
