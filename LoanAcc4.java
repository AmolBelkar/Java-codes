package OPPs;

public class LoanAcc4 extends Account4 {
	
	double loanAmount;
	int cibil;
	
	public LoanAcc4() {}
	
	LoanAcc4(String user, String bank, String branch, String type, long accno, double loanAmount, int cibil)
	{
		this.user = user;
		this.bank = bank;
		this.branch = branch;
		this.type = type;
		this.accno = accno;
		this.loanAmount = loanAmount;
		this.cibil = cibil;
	}
	
	public void displayLoanAcc()
	{
		displayAccount();
		System.out.println("Amount Of Loan :- "+loanAmount);
		System.out.println("Cibil Score :- "+cibil);
	}
}
