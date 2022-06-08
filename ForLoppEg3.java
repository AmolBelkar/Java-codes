// Program for sum of even and product of odd number from 10 to 20
public class ForLoppEg3 {

	public static void main(String[] args)
	{
		int sum=0;
		long prod=1;
		
		for (int i = 10; i <=20; i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
			else
			{
				prod=prod*i;
			}
		}
		System.out.println("The Sum Of Even Number "+sum);
		System.out.println("The Product Of Odd Number "+prod);
	}

}
