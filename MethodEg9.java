// Program to design a method to return the factorial. 
public class MethodEg9 {

	public static void main(String[] args) 
	{
		int res=factorial(5);
		System.out.println("Factorial of given value --->"+res);
	}
	
	public static int factorial(int a)
	{
		int res=1;
		while(a>0)
		{
			res = res*a;
			a--;
		}
		return res;
	}
}
