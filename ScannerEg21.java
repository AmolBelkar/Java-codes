// Program to find the neon number i.e. square of user given number and Add the 
// digits and check the number is same as given number.
import java.util.Scanner;
public class ScannerEg21 {

	public static void main(String[] args) {

		Scanner sc  = new Scanner (System.in);
		System.out.println("Enter the Value");
		int num = sc.nextInt();
		int sum = 0;
		int var = num*num;
	
		while(var>0)
		{
			int dig = var%10;
			sum = sum+dig;
			var = var/10;
		}
		if(sum==num)
		{
			System.out.println("Neon Number");
		}
		else
		{
			System.out.println("Not a Neon Number");
		}	
	}
}
