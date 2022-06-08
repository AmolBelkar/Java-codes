package OPPs;

public class MobileDriver2 {

	public static void main(String[] args) 
	{
		Mobile2 m1 = new 	Mobile2("Nokia", "Lumia", "ED3124", "SnapDragon", "White", 4, 64, 15000, 128);
		m1.displayMobile2();
		
		m1.insertSim2("BSNL", "4G", "Micro", 987654321, "Pre-Paid");
		m1.s1.displaySim2();
		
		
		Mobile2 m2 = new Mobile2("Xiomi", "Redmi", "Mi1234", "SnapDragon", "Electric Blue", 12, 64, 19000, 264);
		m2.displayMobile2();
		
		m2.insertSim2("Airtel", "4G", "Nano", 702814004, "Post-Paid");
		m1.s1.displaySim2();
		


	}

}
