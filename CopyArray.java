// Copy Elements Of An Aerray Into Another Array
package ArrayPrograms;
import java.util.*;

public class CopyArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the Array");
		int length = sc.nextInt();
		int arr1[] = new int[length];
		int arr2[] = new int[length];
		
		System.out.println("Enter the Elements Of the Array");
		for(int i = 0; i<arr1.length; i++)
		{
			arr1[i] = sc.nextInt();
		}
		
		for(int i = 0; i<arr2.length; i++)
		{
			arr2[i] = arr1[i];
		}
		System.out.println("The Original Array Is"+Arrays.toString(arr1));

		arr1[1] = 23;
		arr1[3] = 56;
		
		System.out.println("The Updated Array Is"+Arrays.toString(arr1));

		System.out.println("The Copied Array Is"+Arrays.toString(arr2));

	}

}
