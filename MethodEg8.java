// Program to return the values
public class MethodEg8 {
//----------------------Main Method------------------------------//
	public static void main(String[] args)
	{
		int res = add(10,12);
		System.out.println("Sum --->"+res);
		even(res);
	}
//---------------------Add Method--------------------------------//
	public static int add(int a, int b)
	{
		int  c  = a + b;// type of value returning should be the type of method i.e. int.
		return c;
	}
//----------------------Even Method------------------------------//	
	public static void even(int a)
	{
		if(a%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
}
