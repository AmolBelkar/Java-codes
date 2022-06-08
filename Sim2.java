package OPPs;

public class Sim2 {
	
	String serviceProvider;
	String type;
	String size;
	long no;
	String mode;
	
	Sim2(){}
	
	Sim2(String sp, String type,	String size,	long no,	String mode)
	{
		serviceProvider = sp;
		this.type = type;
		this.size = size;
		this.no = no;
		this.mode = mode;
	}
	
	public void displaySim2()
	{
		System.out.println("Service Provider :- "+ serviceProvider);
		System.out.println("Type Of Sim :- "+type);
		System.out.println("Size Of Sim :- "+size);
		System.out.println("Number Of Sim :- "+no);
		System.out.println("Mode Of Payment :- "+mode);
		System.out.println("===========================");
	}
}
