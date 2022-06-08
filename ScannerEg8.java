// Program to display values between start value and end values
// given by user.
import java.util.Scanner;
public class ScannerEg8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Starting Value");
		
		int start = sc.nextInt();
		
		System.out.println("Enter the Ending Value");
		
		int end = sc.nextInt();
		
		while(start<=end)
		{
			System.out.println(start);
			start++;
		}

	}

}
