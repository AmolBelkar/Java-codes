// Program for entering the string and char values.
import java.util.Scanner;
public class ScannerEg3 {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the value");
		
		//String str = sc.nextLine();
													   //0123
		char ch= sc.next().charAt(3);  // java
		
		System.out.println(ch);
		
	}

}
