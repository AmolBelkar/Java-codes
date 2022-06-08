// Program about finding the factorial of the number.
import java.util.Scanner;
public class ScannerEg14
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Value");
		int num = sc.nextInt();

		int fact=1;
		
		while(num>1)
		{
			fact = fact*num;
			num--;
		}
		
		System.out.println("The Factorial of the Value is ---> "+fact);
	}
}
