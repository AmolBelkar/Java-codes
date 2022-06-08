// Program to show the given number is prime palindrome or not.
import java.util.Scanner;
public class MethodEg5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Value");
		int num = sc.nextInt();
		
		prime(num);
		palindrome(num);
	}
	
	//-------------------------------------------Method For Palindrome Number
	
	private static void palindrome(int a)//Private-------------access within the class
	{
		int reverse = 0,  temp = a;
		while(a>0)
		{
			int digit = a%10;
			reverse = (reverse*10)+ digit;
			a = a/10;
		}
		if(temp==reverse)
		{
			System.out.println("Given Number Is A Palindrome Number");
	//		prime(temp);  ------->  Possible
		}
		else
		{
			System.out.println("Given Number Is Not A Palindrome Number");
		}	
	}
	
//--------------------------------------------------Method For Prime Number	
	
	public static void prime(int a)
	{
		int i = 2;
		while (a>=i)
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
		else
		{
			System.out.println(a+" Is Not A Prime Number");
		}		
	}
}
