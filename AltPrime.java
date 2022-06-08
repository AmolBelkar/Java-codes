package OPPs;

public class AltPrime {
	
	public static boolean isPrime (int n) {
		
			int i;
			for( i=2; i<=n; i++)
			{
				if(n%i==0)
				{
					break;
				}
			}
				if(n==i)
				{
					return true;
				}
				else
				{
					return false;
				}
		
	}
	
	public static void main(String[] args) {
		int temp = 0;
		for(int i=1; i<=30; i++)
		{
			if(isPrime(i))
			{
				if (temp%2==0)
				{
					System.out.println(i);
				}
				temp++;
			}
		}
	}
}
