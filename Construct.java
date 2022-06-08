
public class Construct {
	String name;
	int id;
	int mob;
	int age;
	String gn;
	
	public Construct(String name,int id,int mob,int age,String gn)
	{
		this.name=name;
		this.id=id;
		this.mob=mob;
		this.age=age;
		this.gn=gn;
	}

	public static void main(String[] args) {
		
		Construct c1= new Construct("Nagesh",2621,7020, 25,"Male");
		c1.printt();
		System.out.println("-------------------------");
		Construct c2=new Construct("Amol",2627,7045,22,"Male");
		c2.printt();
		
		

	}
	public void printt()
	{
	System.out.println("Name is = "+name);
	System.out.println("Id is = "+id);
	System.out.println("Mobile no = "+mob);
	System.out.println("Age is = "+age);
	System.out.println("Gender is = "+gn);
	}

}
