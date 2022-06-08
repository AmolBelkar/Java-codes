// Merge Two Sorted Arrays 
package ArrayPrograms;
import java.util.*;

public class Merge2SortedArrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Length Of The First Array");
		int length1 = sc.nextInt();
		int arr1[] = new int[length1];
		System.out.println("Enter The Elements Of The First Array");
		for(int i = 0; i<arr1.length; i++)
		{
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Enter The Length Of The Second Array");
		int length2 = sc.nextInt();
		int arr2[] = new int[length2];
		System.out.println("Enter The Elements Of The Second Array");
		for(int i = 0; i<arr2.length; i++)
		{
			arr2[i] = sc.nextInt();
		}
		
		int newArray[] = new int[arr1.length+arr2.length];
		
		// Copying The Elements Of The First Array 
		System.arraycopy(arr1,0,newArray,0,arr1.length);
		
		// Copying The Elements Of The Second Array
		System.arraycopy(arr2,0,newArray,arr1.length,arr2.length);
		
		System.out.println("New Merged Array Is "+Arrays.toString(newArray));
		
		Arrays.sort(newArray);
		
		System.out.println("New Sorted Array Is "+Arrays.toString(newArray));

	}

}
