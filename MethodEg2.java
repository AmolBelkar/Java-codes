// Program to find all the odd number from user given range by using method
import java.util.Scanner;
public class MethodEg2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Starting Value");
		int start = sc.nextInt();
		System.out.println("Enter The Ending Value");
		int end = sc.nextInt();

		while(start<=end)
		{
			even(start);
			start++;
		}
	}
//--------------------------------------------------------------------------------------------	
	public static void even(int a)
	{
		if(a%2==0)
			System.out.println("Even Number "+a);
	}
}
