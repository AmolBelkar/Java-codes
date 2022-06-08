package OPPs;

public class fruit3 {
	
	String name;
	String taste;
	String colour;
	String shape;
	double price;
	
	public fruit3() {}
	
	fruit3 (String name, String taste, String colour, String shape, double price)
	{
		this.name = name;
		this.taste = taste;
		this.colour = colour;
		this.shape = shape;
		this.price = price;
	}
	
	public void displayFruit()
	{
		System.out.println("Name Of The Fruit :- "+name);
		System.out.println("Taste Of The Fruit :- "+taste);
		System.out.println("Colour Of The Fruit :- "+colour);
		System.out.println("Shape Of The Fruit :- "+shape);
		System.out.println("Price Of The Fruit :- "+price);
		System.out.println("============================");
	}
}
