// Print all the prime numbers in the user given range
import java.util.Scanner;
public class ScannerEg18 {

	public static void main(String[] args) {
		
		Scanner str = new Scanner (System.in);
		System.out.println("Enter the Starting Value");
		int start = str.nextInt();
		
		Scanner en = new Scanner (System.in);
		System.out.println("Enter the Ending Value");
		int end = en.nextInt();
		int sum = 0;
				
		while(end>=start)
		{
			start++;
			int i = 2;
			while(start>=i)      // >8=2
			{
				if(start%i==0)  //7%2==0 ---> false
				{
					break;
				}
				i++; // 2++ ---> 3
			}
		
			if(start==i)
			{
				System.out.println(start);
				sum = sum+start;
			}		
		}
		System.out.println(sum);
	}
}
