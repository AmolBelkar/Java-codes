// Program to find Armstrong Number i.e. seperate the digits gives them power as 
// the number of the digits and add them and check the sum is same as given number
import java.util.Scanner;
public class ScannerEg22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("E341nter the Value");
		int num = sc.nextInt();
		
		int count = 0;
		int temp=num;
//--------------------------------------------------count digit	
		while(num>0)
		{
			int dig = num%10;
			count++;              // count digit
			num = num/10;     // remove digit
		}
		 num=temp;
		System.out.println(count);
		
		int sum = 0;

		while(num>0)           //seperate the digit
		{
			int pow = count;
			int res = 1;
			int dig = num%10;     // fetch the last digit
		
		
		while (pow>0)
		{
			res = res*dig;
			pow--;
		}
		
		sum = sum+res;
		num = num/10;
		}
		if(sum==temp)
		System.out.println("Armstrong Number");
		
		else
		System.out.println("Not a Armstrong Number");	
	}

}
