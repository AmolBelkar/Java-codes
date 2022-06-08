// Compare The Given 2 Arrays.
package ArrayPrograms;
import java.util.*;

public class CompareArrays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int length = sc.nextInt();
		
		int arr1[] = new int[length];
		int arr2[] = new int[length];
		
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
		
		if(Arrays.equals(arr1,arr2))
		{
			System.out.println("Arrays Have Same Elements");
		}
		else
			System.out.println("Arrays Don't Have Same Elements");	
	}

}
