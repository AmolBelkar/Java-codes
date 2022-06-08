// Sorting of the array
package ArrayPrograms;
import java.util.*;

public class SortingOfArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the Array");
		int length = sc.nextInt();
		
		int arr[] = new int[length];
		System.out.println("Enter The Elements Of The Array");
		for(int i = 0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Array Before Sorting"+Arrays.toString(arr));
		
		Arrays.sort(arr);
		
		System.out.println("Array After Sorting "+Arrays.toString(arr));

	}

}
