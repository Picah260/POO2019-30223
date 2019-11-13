package poocol;

public class ClientFidel extends Client implements Comparable<ClientFidel> {
	public int nrPuncte;
	public int suma;

	public ClientFidel(int id, String name, int produseCumparate, Produs[] produs, int nrPuncte, int suma) {
		super(id, name, produseCumparate, produs);
		this.nrPuncte = nrPuncte;
		this.suma = suma;
	}

	public double calculeazaDiscount(int suma) {
		return 10 * suma / 100;
	}

	public int compareTo(ClientFidel f) {
		if (this.suma > f.suma)
			return 1;
		if (this.suma == f.suma)
			return 0;
		return -1;

	}

	public String toString() {
		return this.suma + " " + this.name + " " + this.id;
	}

}
