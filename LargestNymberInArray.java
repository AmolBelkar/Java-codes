//Largest number in the array
package ArrayPrograms;
import java.util.*;

public class LargestNymberInArray {
	
	public static int largest(int arr [])
	{
		int max = arr[0];
		for(int i = 0; i<arr.length; i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the length of the Array");
		int length = sc.nextInt();
		
		int arr[] = new int[length];
		System.out.println("Enter The Elements Of The Array");
		for(int i = 0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("The Largest Number In The Array Is "+largest(arr));

	}

}
