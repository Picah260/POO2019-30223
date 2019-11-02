
public class CurrentAccount extends Account {
private int overdraftLimit;
public int getOverdraftLimit() {
	return overdraftLimit;
}


public void setOverdraftLimit(int overdraftLimit) {
	this.overdraftLimit = overdraftLimit;
}






	public CurrentAccount(int number, int overdraftLimit) {
	super(number);
	this.overdraftLimit = overdraftLimit;
}


	public String toString() {

		return "Account " +getNumber()+ ": " + "balance = " + getBalance()+overdraftLimit;

	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



}
