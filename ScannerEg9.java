//Program to create table from 1 to user given value.
import java.util.Scanner;
public class ScannerEg9 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		
		int num = sc.nextInt();
		
		for (int start = 1; start<= num; start++) 
		{	
			for (int i=1 ; i<=10; i++) 
			{
				System.out.println(start+" X "+i+" = "+(start*i));
			}
			System.out.println("-----------------------------------------------");
		}	
	}
}
