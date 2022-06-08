// Program for separate the digits and print odd digits 
//from user given value
import java.util.Scanner;
public class ScannerEg6 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int i1 = sc.nextInt();//................Initialization
		int sum =0;
		long prod=1;
		
		while(i1>0) //.............Condition
		{
			int dig = i1%10;
			if(dig%2==1)
			{
				System.out.println(dig);
			}
		
			i1=i1/10;//......................Updation
		}

	}

}