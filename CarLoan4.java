package OPPs;

public class CarLoan4 extends LoanAcc4 {
	
	double interest;
	String carDetail;
	int duration;
	double emi;
	double carLoanAmount;
	
	public CarLoan4() {}
	
	CarLoan4(String user, String bank, String branch, String type, long accno, double loanAmount, int cibil,
			double interest, String carDetail, int duration, 	double emi, double carLoanAmount)
	{
		this.user = user;
		this.bank = bank;
		this.branch = branch;
		this.type = type;
		this.accno = accno;
		this.loanAmount = loanAmount;
		this.cibil = cibil;
		this.interest = interest;
		this.carDetail = carDetail;
		this.duration = duration;
		this.emi = emi;
		this.carLoanAmount = carLoanAmount;
	}
	
	public void displayCarLoan()
	{
		displayLoanAcc();
		System.out.println("Interest Of Loan :- "+interest);
		System.out.println("Details Of Car :-"+carDetail);
		System.out.println("Duration Of Loan :-"+duration);
		System.out.println("EMI Of Loan :- "+emi);
		System.out.println("Car Loan Amount :- "+carLoanAmount);
	}
}
