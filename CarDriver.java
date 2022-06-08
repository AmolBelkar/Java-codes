package OPPs;

public class CarDriver {

	public static void main(String[] args) 
	{
		Car c1 = new Car ("Black", "TATA", "Harrier", "SUV", 2500000, 13);
		
		c1.displayCar();
		c1.e1.displayEngine();
		
		
		Car c2 = new	Car ("White", "TATA", "Harrier", "SUV", 150000, 13);
		
		c2.displayCar();
		c2.e1.displayEngine();
	}
}
