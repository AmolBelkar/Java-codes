//Design method to check given value is even or odd
public class MethodEg11 {

	public static void main(String[] args) {
		 
		boolean res = even(23);
		System.out.println(res);

	}
	
	public static boolean even(int a)
	{
		if(a%2==0)
			return true;
		else
			return false;
	}
}
