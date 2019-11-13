package poocol;

public class Supermarket {
	protected int nrClientiFideli;
	protected int nrAngajati;
	protected Angajat[] a;
	protected ClientFidel[] c;
	protected Produs[] p;
	protected int nrProduse;
	protected int nrProduseClienti;
	protected int nrProduseClientiFideli;

	public Supermarket(int nrClientiFideli, int nrAngajati, Angajat[] a, ClientFidel[] c, Produs[] p, int nrProduse,
			int nrProduseClienti, int nrProduseClientiFideli) {
		super();
		this.nrClientiFideli = nrClientiFideli;
		this.nrAngajati = nrAngajati;
		this.a = new Angajat[5];
		this.c = new ClientFidel[5];
		this.p = new Produs[5];
		this.nrProduse = nrProduse;
		this.nrProduseClienti = nrProduseClienti;
		this.nrProduseClientiFideli = nrProduseClientiFideli;
	}

	public int nrProduseVanduteClientiFideli() {
		return this.nrProduseClientiFideli;
	}

	public int nrProduseVanduteClienti() {
		return this.nrProduseClienti;
	}

	void addAngajat(Angajat b) {
		nrAngajati++;
		a[nrAngajati] = b;

	}

	void addProdus(Produs a) {
		nrProduse++;
		p[nrProduse] = a;

	}

	void addClientFidel(ClientFidel b) {
		nrClientiFideli++;
		c[nrClientiFideli] = b;
	}

}
