// Program for reverse the user given number and check its palindrom or not if yes print 
// yes if no print no.
import java.util.Scanner;
public class ScannerEg11 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Value");
		int i1 = sc.nextInt();
		int reverse = 0;
		int sum = 0;
		int reminder = 0;
		int temp = 0;
		
		while(i1>0)
		{    //         = 1234 % 10 ---> digit = 4
			int digit = i1%10;
			
			//         =  0 * 10 + 4 ---> reverse = 4
			reverse = reverse * 10 + digit;
			
			// = 1234/10 ---> i1 = 123
			i1 = i1/10;
		}
		System.out.println("Reversed Number Is ---> "+reverse);	
	//        = 4321 ---> temp = 4321	
		
		temp=reverse;
		
		while(reverse>0)
		{			//   =  4321 % 10 ---> reminder = 1
			reminder = reverse%10;
			
			  // = (0 * 10 )+ 1 ---> 1
			sum = (sum*10)+reminder;
			
			         //= 4321/10 ---> 432
			reverse = reverse/10;
		}
		if (temp==sum)
		{
			System.out.println(temp+" Is A Palindrome Number");
		}
		else
		{
			System.out.println(temp+" Is Not A Palindrome Number");
		}
	}
}
