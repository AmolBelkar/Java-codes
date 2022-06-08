// Program to find the user given value is in raising (acending) order or not.
import java.util.Scanner;
public class ScannerEg16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Value");
		int num = sc.nextInt();
		
		while(num>0)
		{
			int currentdig = num%10;
			num = num/10;
			int nextdig = num%10;
			if(currentdig<=nextdig)
			{
				System.out.println("Digits Not In Raising Order");
				break;
			}
			if(num==0)
			{
				System.out.println("Digits In Raising Order");
			}
		}
		

		
	}

}
