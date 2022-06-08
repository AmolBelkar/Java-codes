// Program to find the Prime number from user given range by using method.
import java.util.Scanner;
public class MethodEg7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Starting Value");
		int start = sc.nextInt();
		System.out.println("Enter Ending Value");
		int end = sc.nextInt();

		while(start<=end)
		{
			MethodEg4.prime(start);
			start++;
		}
		
	}

}
