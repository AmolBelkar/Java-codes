package OPPs;

public class Mobile2 {
	
	String brand;
	String name;
	String imei;
	String processor;
	String colour;
	int ram;
	int cam;
	double price;
	int memory;
	
	Mobile2(){}
	
	Mobile2(String brand, String name, String imei, String processor, String colour, int ram, int cam, double price, int memory)
	{
		this.brand = brand;
		this.name = name;
		this.imei = imei;
		this.processor = processor;
		this.colour = colour;
		this.ram = ram;
		this.cam = cam;
		this.price = price;
		this.memory = memory;
	}
	
	public void displayMobile2()
	{
		System.out.println("Brand :- "+brand);
		System.out.println("Name :- "+name);
		System.out.println("IMEI :- "+imei);
		System.out.println("Processor :- "+processor);
		System.out.println("Colour :- "+colour);
		System.out.println("Ram :- "+ram);
		System.out.println("Camera :- "+cam);
		System.out.println("Price :- "+price);
		System.out.println("Memory :- "+memory);
		System.out.println("Sim Is Not Inserted");
		System.out.println("=====================");
	}
	Sim2 s1 = null;
	public void insertSim2(String sp, String type, String size,	long no,	String mode)
	{
		s1 = new Sim2(sp, type, size, no, mode);
		System.out.println("Sim Inserted Successfully");
	}
	
	
	
	
	
	
	
	
}
