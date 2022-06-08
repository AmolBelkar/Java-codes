// Smallest number in the array
package ArrayPrograms;
import java.util.*;

public class SmallestNumberInArray {
	
	public static int smallest(int arr[])
	{
		int min = arr[0];
		for(int i = 0; i<arr.length; i++)
		{
			if(min>arr[i])
			{
				min = arr[i];
			}
		}
		return min;
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
		
		System.out.println("Smallest Number In The Array Is "+smallest(arr));	
	}
}
