package OPPs;

public class Account4 {
	
	String user;
	String bank;
	String branch;
	String type;
	long accno;
	
	public Account4() {}
	
	Account4(String user, String bank, String branch, String type, long accno)
	{
		this.user = user;
		this.bank = bank;
		this.branch = branch;
		this.type = type;
		this.accno = accno;
	}
	
	public void displayAccount()
	{
		System.out.println("Name Of User :- "+user);
		System.out.println("Name Of bank :- "+bank);
		System.out.println("Name Of Branch :- "+branch);
		System.out.println("Name Of Acc. Type :- "+type);
		System.out.println("Account Number :- "+accno);
	}	
}
