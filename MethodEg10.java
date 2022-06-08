// Program to create method which return power of given value.
public class MethodEg10 {

	public static void main(String[] args)
	{
		int res = power(6,2);
		System.out.println(res);
	}
	
	public static int power(int a, int b)
	{
		int res = 1;
		while(b>0)
		{
			res = res*a;
			b--;
		}
		return res;
	}

}
