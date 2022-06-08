// Program about how methods works
public class MethodEg1 {

	public static void main(String[] args) {
		System.out.println("Main Method Starts");
		
		add(22,5);
		even(22);
		even(5);
		add(5,10);
		
		System.out.println("Main Method Ends");
	}
//--------------------------------------------------------------------------------------	
	public static void add(int a , int b)
	{
		System.out.println("Sum ---> "+(a+b));
	}
//---------------------------------------------------------------------------------------	
	public static void even(int a)
	{
		if(a%2==0)
			System.out.println("Even Number "+a);
		else
			System.out.println("Odd Number "+a);
		
	}
}
