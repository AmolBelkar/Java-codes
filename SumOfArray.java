// Sum Of the Array Elements
package ArrayPrograms;
import java.util.*;
public class SumOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int [] arr = null;
		System.out.println("Enter the size of the Array");
		int length  = sc.nextInt();
		arr = new int[length];
		
		System.out.println("Enter the elements of the array");
		for(int i = 0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		int addition = 0;
		
		// ----------------------------Using For Each Loop-------------------------------//
		for(int element:arr)
		{
			sum = sum+element;
		}
		
		//--------------------------------Using For Loop-----------------------------------//
		for(int i = 0; i<arr.length; i++)
		{
			addition = addition+arr[i];
		}
		
		System.out.println("Sum Of The Elements Of The Array Is "+sum);
		System.out.println("Addition Of The Elements Of The Array Is "+addition);
		
	}

}
