// Program to find the user given number is Prime number or not. 
import java.util.Scanner;
public class ScannerEg17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Value");
		int num = sc.nextInt();
		int i = 2;
		while(num>=i)      // >8=2
		{
			if(num%i==0)  //7%2==0 ---> false
			{
				break;
			}
			i++; // 2++ ---> 3
		}
		
		if(num==i)  // 7==3
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not a Prime Number");
		}

	}

}
