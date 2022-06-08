// Program for binary values from user given range
import java.util.Scanner;
public class ScannerEg24 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Starting Value");
		int start = sc.nextInt();
		
		System.out.println("Enter The Ending Value");
		int end = sc.nextInt();
		
		while (start<=end)
		{
			int num = start;
		
		String res = " ";
		while(num>0)
		{
			int dig = num%2;   // to convert into binary we divide by 2.
			res = dig + res;
			num = num/2;	
		}
		System.out.println("Binary Equivalent Value Of "+start+" Is --->"+ res);
		
		start++;
		}
	}
}
