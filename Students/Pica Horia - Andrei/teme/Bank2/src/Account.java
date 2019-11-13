
public class Account {

	public int number;
	public double balance;

	public Account(int number) {

		this.number = number;

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

	public String toString() {

		return "Account " + number + ": " + "balance = " + balance;

	}

	public final void print() {

		System.out.println(toString());

	}

}