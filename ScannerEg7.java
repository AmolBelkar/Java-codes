	// Program to create a table for user given value
	import java.util.Scanner;
	public class ScannerEg7 {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Value");
		int i1 = sc.nextInt();
		
		for (int i = 1; i<=10; i++) 
		{
			System.out.println(i1 +" X " + i +" = " + ( i1*i));
		}		
	}
}
