// Design Method to find given number is prime or not by using method
import java.util.Scanner;
public class MethodEg14 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Value");
		int num = sc.nextInt();
		boolean res = prime (num);
		System.out.println(res);
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
