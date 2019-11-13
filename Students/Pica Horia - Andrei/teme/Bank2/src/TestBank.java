
public class TestBank {
	public static void updateTest() {
		Bank b = new Bank(
				new Account[] { new CurrentAccount(0, 65), new SavingsAccount(1, 25), new CurrentAccount(2, 12) }, 3);
		b.getAccountAt(0).deposit(64);
		b.getAccountAt(1).deposit(1);
		b.getAccountAt(2).deposit(3);
		b.update();

	}

	public static void main(String[] args) {
	TestBank.updateTest();

	}

}
