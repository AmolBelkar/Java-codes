	// Design method to count palindrome number in the range by using method and check the 
// count is palindrome or not.
import java.util.Scanner;
public class MethodEg16 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Starting Value");
		int start = sc.nextInt();
		System.out.println("Enter The Ending Value");
		int end = sc.nextInt();
		int count = 0;
		while(start<=end)
		{
			boolean res = palindrome(start);
			if(res==true)
			{
				System.out.println("Palindrome Number Is "+start);
				count++;
			}
			start++;
		}
		System.out.println("The Count Of Palindrome Number Is "+count);
	}

	public static boolean palindrome(int a) 
	{
		int reverse = 0, temp = a;
		while(a>0)
		{
			int digit = a%10;
			reverse = (reverse*10)+digit;
			a = a/10;
		}
		if(reverse == temp)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
