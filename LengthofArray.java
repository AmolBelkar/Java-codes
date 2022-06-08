// Find length of an array.
package ArrayPrograms;
import java.util.*;

public class LengthofArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int[] a = new int[5]; 
		System.out.println("Enter the elements of array:");
		
		for(int i = 0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Elements Of Array Are " );
		for(int i = 0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Size of the given Array is "+ a.length);
	}
}
