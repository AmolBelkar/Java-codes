// Program to find the binary value of the user given number.
import java.util.Scanner;
public class ScannerEg23 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Value");
		int num = sc.nextInt();

		String res = " ";
		while(num>0)
		{
			int dig = num%2;
			res = dig + res;
			num = num/2;
		}
		
		System.out.println("Binary Equivalent Value "+ res);

}
}
