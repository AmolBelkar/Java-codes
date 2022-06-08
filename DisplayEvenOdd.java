package ArrayPrograms;
import java.util.*;

public class DisplayEvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the Array");
		int length = sc.nextInt();
		int[] arr = new int[length];
		System.out.println("Enter the elements of the array");
		
		for(int i = 0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		displayOddEven(arr);
	}
	
		
		public static void displayOddEven(int[]arr)
		{	
			int odd = 0;
			int even = 0;
			for(int i = 0; i<arr.length; ++i)
			{
				if(arr[i]%2==0)
				{
					even++;
				}
				else
					odd++;	
			}
			System.out.println("Count Of Even Elements In Array Is "+even);
			System.out.println("Count Of Odd Elements In Array Is "+odd);	
		
				
		}
}
