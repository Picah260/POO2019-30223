import java.util.ArrayList;

public class FacebookAccount {
	private String nume;
	private int varsta;
	private String locatie;
	private ArrayList<FacebookAccount> listaPrieteni = new ArrayList<FacebookAccount>();

	public FacebookAccount(String nume, int varsta, String locatie) {
		this.nume = nume;
		this.varsta = varsta;
		this.locatie = locatie;
	}

	public String getLocatie() {
		return locatie;
	}

	void adaugaPrieten(FacebookAccount f) {
		listaPrieteni.add(f);

	}

	void stergePrieten(FacebookAccount f) {
		listaPrieteni.remove(f);
	}

	void printList() {
		for (FacebookAccount i : listaPrieteni) {
			System.out.println(i);

		}
	}

	public ArrayList<FacebookAccount> GasestePrietenii() {
		ArrayList<FacebookAccount> prieteniApropiere = new ArrayList<FacebookAccount>();
		for (FacebookAccount i : listaPrieteni) {
			if (i.getLocatie().equals(this.locatie))
				prieteniApropiere.add(i);
		}
		return prieteniApropiere;

	}

	@Override
	public String toString() {
		return "FacebookAccount [nume=" + nume + ", varsta=" + varsta + ", locatie=" + locatie + ", listaPrieteni="
				+ listaPrieteni + "]";
	}

}
