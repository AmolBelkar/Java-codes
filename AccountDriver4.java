package OPPs;

public class AccountDriver4 {

	public static void main(String[] args) {
		
		CarLoan4 c1 = new CarLoan4("Amol", "SBI", "Deccan", "Saving", 54321, 100000.00, 45,
				50000,"MH 1234", 3, 10000, 300000);
		
		c1.displayAccount();
		System.out.println("==============================");
		
		c1.displayLoanAcc();
		System.out.println("==============================");
		
		c1.displayCarLoan();
		System.out.println("==============================");
	}
}
