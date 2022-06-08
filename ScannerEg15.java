// Program to find the sum of digits of user given value if the sum is even then take the
// power of that sum and for power use the count of digits of user given value, if the 
// value is odd then take the factorial of that value.
import java.util.Scanner;
public class ScannerEg15 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value");
		int num = sc.nextInt();
		
		int sum = 0, count = 0;
		
		while(num>0)
		{
			int dig = num%10;
			sum = sum + dig;
			count++;
			num = num/10;
		}
		System.out.println("Sum is ---> "+sum);
		
		if(sum%2==0)
		{
		
			int result = 1;
			while(count>0)
			{
				result = result*sum;
				count--;
			}
			System.out.println("Result is Even ---> "+result);
		}
		else
		{
			int fact = 1;
			while(sum>0)
			{
				fact = fact*sum;
				sum--;
			}
			System.out.println("Result is Odd ---> "+fact);
		}	
	}
}
