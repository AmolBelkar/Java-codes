// Sum Of The Elements Of The 2 Arrays
package ArrayPrograms;
import java.util.*;

public class SumOf2Array {

	public static void main(String[] args) {
		
		int [] arr1 = null;
		int[] arr2 = null;
		int[] arr3 = null;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the length of Array");
		int length = sc.nextInt();
		
		 arr1 = new int[length];
		 arr2 = new int[length];
		 arr3 = new int[length];
		 
		 System.out.println("Enter The Elements Of The First Array");
		 for(int i = 0; i<arr1.length; i++)
		 {
			 arr1[i] = sc.nextInt();
		 }
		 
		 System.out.println("Enter The Elements Of The Second Array");
		 for(int i = 0; i<arr2.length; i++)
		 {
			 arr2[i] = sc.nextInt();
		 }
		 
		 for(int i = 0; i<arr3.length; i++)
		 {
			 arr3[i] = arr1[i] + arr2[i];
		 }
		 
		System.out.println("Sum Of The 2 Array Is"+Arrays.toString(arr3));
		 
	}

}
