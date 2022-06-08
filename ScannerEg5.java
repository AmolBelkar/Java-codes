// Program for separate the digits from user given value
import java.util.Scanner;
public class ScannerEg5 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int i1 = sc.nextInt();//................Initialization
		
		while(i1>0) //.............Condition
		{
			int dig = i1%10;
			
			System.out.println(dig);
			
			i1=i1/10;//......................Updation
		}

	}

}
