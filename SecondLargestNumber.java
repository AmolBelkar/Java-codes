// Second largest number in the array
package ArrayPrograms;
import java.util.*;

public class SecondLargestNumber {
	
	public static int seclargest(int arr[])
	{
		int firstlarge = arr[0];
		int secondlarge = arr[0];
		
		for(int i = 0; i<arr.length; i++)
		{
			if(firstlarge<arr[i])
			{
				secondlarge = firstlarge;
				firstlarge = arr[i];
			}
			else if(secondlarge<arr[i])
			{
				secondlarge = arr[i];
			}
		}
		return secondlarge;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Length Of The Array");
		int length = sc.nextInt();
		int arr[] = new int[length];
		System.out.println("Enter The Elements Of The Array");
		for(int i = 0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Second Large Value Of The Array Is "+ seclargest(arr));
		
	}

}
