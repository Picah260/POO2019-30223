package poocol;

public class Client extends Persoana {
	public int produseCumparate;
	public Produs[] produs;

	public Client(int id, String name, int produseCumparate, Produs[] produs) {
		super(id, name);
		this.produseCumparate = produseCumparate;
		this.produs = produs;
	}

	void addProdus(Produs p) {
		produseCumparate++;
		produs[produseCumparate] = p;

	}

	void afisareProdus() {
		for (int i = 1; i <= produseCumparate; i++) {
			System.out.println(produs[i].getName());

		}

	}
}
