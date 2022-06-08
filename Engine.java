package OPPs;

public class Engine {
	
	int no_of_cy;
	String fuel;
	double cc;
	int stroke;
	double hp;
	String cooling;

	Engine(){}
	
	Engine(int no_of_cy, String fuel, 	double cc, 	int stroke, 	double hp, 	String cooling)
	{
		System.out.println("Engine Is Getting Created");
		this.no_of_cy = no_of_cy;
		this .fuel = fuel;
		this.cc = cc;
		this.stroke = stroke;
		this.hp = hp;
		this.cooling = cooling;
		System.out.println("Enigne Creation Is Completed");
	}
	
	public  void displayEngine()
	{
		System.out.println("No Of Cylinders :- "+no_of_cy);
		System.out.println("Type Of Fuel :- "+fuel);
		System.out.println("HP :- "+hp);
		System.out.println("Stroke :- "+stroke);
		System.out.println("CC :- "+cc);
		System.out.println("Type Of Cooling :- "+cooling);
		System.out.println("===========================");
	}
}
