package OPPs;

public class Apple3 extends fruit3{
	
	String origin;
	
	public Apple3() {}
	
	Apple3(String name, String taste, String colour, String shape, double price, String origin)
	{
		this.name = name;
		this.taste = taste;
		this.colour = colour;
		this.shape = shape;
		this.price = price;
		this.origin = origin;
	}
	
	public void displayApple()
	{
		System.out.println("Name Of The Fruit :- "+name);
		System.out.println("Taste Of The Fruit :- "+taste);
		System.out.println("Colour Of The Fruit :- "+colour);
		System.out.println("Shape Of The Fruit :- "+shape);
		System.out.println("Price Of The Fruit :- "+price);
		System.out.println("Origin Of The Fruit :- "+origin);
		System.out.println("============================");
	}
}
