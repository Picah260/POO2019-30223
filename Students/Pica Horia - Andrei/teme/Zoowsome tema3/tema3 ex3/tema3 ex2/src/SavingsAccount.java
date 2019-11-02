
public class SavingsAccount extends Account {
	private double interest;

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

public SavingsAccount(int number, double interest) {
		super(number);
		this.interest = interest;
	}



public void addinterest()
{
	deposit(interest);
}
public String toString() {

	return "Account " +getNumber()+ ": " + "balance = " + getBalance()+interest;

}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
