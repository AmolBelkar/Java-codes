// Program for  printing the even values upto user entered value.
import java.util.Scanner;
public class ScannerEg2 {

	public static void main(String[] args)
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the value");
	   int i1= sc.nextInt();
	   
	   for (int i = 0; i<=i1; i++) 
	   {
		   if (i%2==0)
		   {
			  System.out.println(i);
		   }
	   }
		
	}

}
