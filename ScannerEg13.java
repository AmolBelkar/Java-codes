// Program about finding the power of the number.
import java.util.Scanner;
public class ScannerEg13
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Base Value");
		int num = sc.nextInt();
		
		System.out.println("Enter the Power Value");
		int pow = sc.nextInt();
		
		int res=1;
		
		while(pow>0)
		{
			res = res*num;
			pow--;
		}


		System.out.println("The Square of the Value is ---> "+res);
	}
}
