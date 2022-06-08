// Program to find perfect number i.e. sum of digit of user given number that can
// divide the user given number.
import java.util.Scanner;
public class ScannerEg20 {

	public static void main(String[] args) {

		Scanner  sc = new Scanner (System.in);
		System.out.println("Enter The Value");
		int num = sc.nextInt();
		int i = 1;
		int sum = 0;
		
		while(num>i)
		{
			if(num%i==0)
			{
				sum = sum+i;
			}
			i++;
		}
		if(sum == num)
		{
			System.out.println("Perfect Number");
		}
		else
		{	
			System.out.println("Not Perfect Number");
		}
	}
}
