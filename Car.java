package OPPs;

public class Car {
	
	String colour;
	String brand;
	String name;
	String type;
	double price;
	double mileage;
	
	Engine e1 = new Engine(4 , "Petrol" , 1000 , 4 , 1.5 , "Oil Cooling");
	
	Car(){}
	
	Car(String colour, String brand, String name, String type, double price, double mileage)
	{
		System.out.println("Car Is Getting Created");
		this.colour = colour;
		this.brand = brand;
		this.name = name;
		this.type = type;
		this.price = price;
		this.mileage = mileage;
		System.out.println("Creation Of Car Is Completed");
	}
	
	public void displayCar()
	{
		System.out.println("Brand :- "+brand);
		System.out.println("Name :- "+name);	
		System.out.println("Type Of Car :- "+type);
		System.out.println("Price :- "+price);
		System.out.println("Colour :- "+colour);
		System.out.println("Mileage :- "+mileage);
		System.out.println("=====================");
	}
}
