// Taking the length of an array from user
package ArrayPrograms;
import java.util.*;

public class ArrayLengthFromUser {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = null;
		System.out.println("Enter The Length Of An Array");
		int length = sc.nextInt();
		
		arr = new int[length];
		
		System.out.println("Enter the elements of Array");
		for(int i = 0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Elements Of The Array Are");
		for(int element:arr)
		{
			System.out.print(element+" ");
		}
	}
}
