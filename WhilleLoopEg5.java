// Program for sum of even values between 60 to 90.
public class WhilleLoopEg5 {

	public static void main(String[] args)
	{
		int i = 60;
		int sum = 0;
		
		while ((i<=90))
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
			i++;
		}
		System.out.println("The sum of Even values is "+sum);

	}

}
