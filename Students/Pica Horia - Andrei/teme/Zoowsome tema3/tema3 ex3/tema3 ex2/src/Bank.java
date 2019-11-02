
public class Bank {
	private Account[] cont;
	private int nr;

	public Bank(Account[] cont, int nr) {
		this.cont = cont;
		this.nr = nr;
	}
void update()
{
	for(int i=0;i<nr;i++)
	if(cont[i] instanceof SavingsAccount)
	{
		((SavingsAccount)cont[i]).addinterest();
		
	}
	else
	 if(cont[i].getBalance()<((CurrentAccount)cont[i]).getOverdraftLimit())
		System.out.printf("Fonduri INSUFICIENTE la contul %d     ",i);
	System.out.println();
}

	public Account[] getCont() {
	return cont;
}
	
	public  Account getAccountAt(int index)
	{
	return cont[index];	
	}

	public void setCont(Account[] cont) {
	this.cont = cont;
}
	public static void main(String[] args) {
	
	}

}
