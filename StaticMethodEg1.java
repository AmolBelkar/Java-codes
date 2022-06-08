// How to access static and non-static methods from different class.
public class StaticMethodEg1 {

	public static void main(String[] args) 
	{
		StaticMethodEg1 e1 = new StaticMethodEg1();
		run();
		test();
		e1.add();
		
		StaticMetEg1 m1 = new StaticMetEg1();
		StaticMetEg1.run();
		m1.add();
	}
	
	public void add()  // Non-static Method
	{
		System.out.println("Add Method");
	}
	
	public static void test()   // Static Method
	{
		System.out.println("Test Method");
	}
	
	public static void run()   // Static Method
	{
		System.out.println("Run Method");
	}

}
