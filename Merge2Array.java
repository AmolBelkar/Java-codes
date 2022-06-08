// Merge 2 Arrays Into A Third New Array
package ArrayPrograms;
import java.util.*;

public class Merge2Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Length Of First Array");
		int arrlen1 = sc.nextInt();
		int arr1[] = new int[arrlen1];
		System.out.println("Enter The Elements Of The First Array");
		for(int i = 0; i<arr1.length; i++)
		{
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Enter The Length Of The Second Array");
		int arrlen2 = sc.nextInt();
		int arr2[] = new int[arrlen2];
		System.out.println("Enter The Elements Of The Second Array");
		for(int i = 0; i<arr2.length; i++)
		{
			arr2[i] = sc.nextInt();
		}
		
		int arr3[] = new int[arr1.length+arr2.length];
		
		// arr1 = array going to be copied
		// 0 = starting point of the arr1
		//arr3 = array in which we are going to copy the first array
		// 0 = starting point of the arr3
		// arr1.length = ending point of the arr3
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);

		System.out.println("Elements Of The First Array Is"+Arrays.toString(arr1));
		System.out.println("Elements Of The Second Array Is"+Arrays.toString(arr2));
		System.out.println("Elements Of The Merged Array Is"+Arrays.toString(arr3));
	}
}
