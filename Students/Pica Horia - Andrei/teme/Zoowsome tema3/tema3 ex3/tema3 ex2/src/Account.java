/**

 * A class for bank accounts.

 *

 * This class provides the basic functionality of accounts. It allows deposits

 * and withdrawals but not overdraft limits or interest rates.

 */
public class Account {



	private int number;

	private double balance;



	public Account(int number) {

		this.setNumber(number);

		this.balance = 0.0;

	}



	public void deposit(double sum) {

		if (sum > 0) {

			balance += sum;

		} else {

			System.err.println("Account.deposit(...): cannot deposit negative amount.");

		}

	}



	public void withdraw(double sum) {

		if (sum > 0) {

			balance -= sum;

		} else {

			System.err.println("Account.withdraw(...): cannot withdraw negative amount.");

		}

	}



	public double getBalance() {

		return balance;

	}



	public double getAccountNumber() {

		return getNumber();

	}



	public String toString() {

		return "Account " + getNumber() + ": " + "balance = " + balance;

	}



	public final void print() {

		// Don't override this,

		// override the toString method

		System.out.println(toString());

	}
	public static void main(String args[])
	{
		
	}



	public int getNumber() {
		return number;
	}



	public void setNumber(int number) {
		this.number = number;
	}

}