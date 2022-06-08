// Program to find sum of odd number from user given range check the
// sum is prime or not
import java.util.Scanner;
public class ScannerEg19 {

	public static void main(String[] args) {
		
		Scanner str = new Scanner (System.in);
		System.out.println("Enter the Starting Value");
		int start = str.nextInt();
		
		Scanner en = new Scanner (System.in);
		System.out.println("Enter the Ending Value");
		int end = en.nextInt();
		
		int sum = 0;
		
		for(  ; start<=end; start++)
		{
			if(start%2==1)
			{
				sum = sum+start;
			}
		}
		
		System.out.println("Sum of Odd Numbers From Given Range ---> "+sum);
		
		int i = 2;
		while(sum>=i)      // >8=2
		{
			if(sum%i==0)  //7%2==0 ---> false
			{
				break;
			}
			i++; // 2++ ---> 3
		}
		
		if(sum==i)  // 7==3
		{
			System.out.println("Sum Is A Prime Number");
		}
		else
		{
			System.out.println("Sum Is Not a Prime Number");
		}
	}

}
