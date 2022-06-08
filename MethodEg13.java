// Design Method to find out given number is palindrome or not in true/false.
import java.util.Scanner;
public class MethodEg13 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Value");
		int num = sc.nextInt(); 
		boolean res = palindrome(num);
		System.out.println(res);
	}

	public static boolean palindrome(int a) 
	{
		int temp = a;
		int reverse = 0;
		while(a>0)
		{
			int digit = a%10;
			reverse = (reverse*10)+digit;
			a = a/10;
		}
		if(temp==reverse)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
