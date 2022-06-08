//program for printing 0 to 20
public class DoWhileEg1 {

	public static void main(String[] args)
	{
		int i =15;
		int sum=0;
		long prod=1;
		do
		{
			if(i%2==0)
			{
				prod=prod*i;
			}
		else
		{
			sum=sum+i;
		}
		
			i++;
			
		} 		while(i<=50);
		System.out.println("The Product of Even Number "+prod);
		System.out.println("The Sum of Odd Number "+sum);


	}

}
