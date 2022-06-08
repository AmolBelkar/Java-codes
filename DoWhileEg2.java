
public class DoWhileEg2 {

	public static void main(String[] args) {
		int i= 20,count=0;
		do
		{
			if(i%6==0)
			{
				count++;   //count=count+1;
			}
			i++;
		}
		while(i<=60);
		
		System.out.println(count);

	}

}
