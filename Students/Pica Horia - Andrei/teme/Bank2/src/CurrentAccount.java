public class CurrentAccount extends Account {

	private int overdraftLimit;

	public CurrentAccount(int number, int overdraftLimit) {

		super(number);

		this.overdraftLimit = overdraftLimit;

	}

	public int getOverdraftLimit() {

		return overdraftLimit;

	}

	public void setOverdraftLimit(int overdraftLimit) {

		this.overdraftLimit = overdraftLimit;

	}

	public String toString() {

		return "Account " + number + ": " + "balance = " + balance + "overdraftLimit=" + overdraftLimit;

	}
}
