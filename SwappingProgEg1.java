// Program for Swapping the values of variables
public class SwappingProgEg1 {

	public static void main(String[] args) {
		
		int a=50,b=100;
		System.out.println("Before Swaping a= "+a+" b= "+b);
		
// ----------------------------------------   swapping with extra variable
		
		//int temp = a;
		//a=b;
		//b=temp;
//-----------------------------------------	swapping without variable
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swaping a= "+a+" b= "+b);	}
}
