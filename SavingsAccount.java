class SavingsAccount 
{
	public static double annualInterestRate = 0.04;
	private double savingsBalance;

	public SavingsAccount(){
		savingsBalance = 0;
	}

	public SavingsAccount(double t){
		setAccount(t);
	}

	public void setAccount(double t){
		savingsBalance = t;
	}

	public void printAccount(){
		System.out.println("$"+(double)Math.round(savingsBalance*100)/100);
	}

	public double caculateMonthlyInterest(){
		double S;
		S = (savingsBalance*annualInterestRate)/12;
		return S;
	}

	public void updatesavingsBalance(){
		savingsBalance += caculateMonthlyInterest();
		printAccount();
	}

	public static double modifyInterestRate(double m){
		annualInterestRate = m;
		return annualInterestRate;
	}

	public static void main(String[] args) 
	{
		SavingsAccount savers1 = new SavingsAccount();
		savers1.setAccount(2000.00);
		System.out.println("Account 1 : ");
		savers1.printAccount();
		savers1.updatesavingsBalance();

		SavingsAccount savers2 = new SavingsAccount(3000.00);
		System.out.println("Account 2 : ");
		savers2.printAccount();
		double m = savers2.modifyInterestRate(0.07);
		savers2.updatesavingsBalance();
	}
}
