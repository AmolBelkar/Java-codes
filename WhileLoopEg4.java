// Program for sum of odd values and product of even values between 15 to 50.

public class WhileLoopEg4 {

	public static void main(String[] args)
	{
		int i = 15;
		int sum = 0;
		long prod=1;
		
		while ((i<=50))
		{
			if(i%2==1)
			{
				sum=sum+i;
			}
			else
			{
				prod=prod*i;
			}
			i++;
		}
		System.out.println("The sum of Odd values is "+sum);
		System.out.println("The product of Even values is "+prod);

	}

}
