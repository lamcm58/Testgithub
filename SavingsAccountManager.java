import java.util.ArrayList;

class SavingsAccountManager 
{
	public static double annualInterestRate = 0.1;
	private double savingsBalance;

	public SavingsAccountManager(){
		savingsBalance = 0;
	}

	public SavingsAccountManager(double t){
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
		ArrayList<Double> arrlist = new ArrayList<Double>(5);
		arrlist.add(2000.00);
		arrlist.add(4500.00);
		arrlist.add(3300.00);
		arrlist.add(5000.00);
		arrlist.add(3500.00);
		
		for (Double acc : arrlist){
			System.out.println("Account : " + acc );
		}
		
		int i;
		for(i = 0;i < 5;i++){
			a[i]=arrlist.get(i);
		}
	}
}
