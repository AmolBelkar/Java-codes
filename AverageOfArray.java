// Finding Average Of the Given Array
package ArrayPrograms;
import java.util.*;
import java.util.*;
public class AverageOfArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[] arr  =null;
		System.out.println("Enter The Length Of The Array");
		int length = sc.nextInt();
		arr = new double[length];
		System.out.println("Enter the elements of the array");
		for(int i = 0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		double sum = 0;
		for(double element:arr)
		{
			sum = sum+element;
		}
		
		System.out.println("The Average Of The Elements "+sum/arr.length);

	}

}
