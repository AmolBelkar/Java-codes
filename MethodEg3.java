// Program to find the user given number is prime number or not.
import java.util.Scanner;
public class MethodEg3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Value");
		int num = sc.nextInt();
		
		prime(num);
	}
//-------------------------------------------------------------------------------------------------	
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
			else
			{
				System.out.println(a+" Is Not A Prime Number");
			}
	}
}
