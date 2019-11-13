package poocol;

public class Produs {
	protected String name;
	protected int pret;
	protected int numarExemplare;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Produs(String name, int pret, int numarExemplare) {
		this.name = name;
		this.pret = pret;
		this.numarExemplare = numarExemplare;
	}

	public boolean verificaStoc(String name, int numarExemplare) {
		if (numarExemplare != 0)
			return true;
		return false;
	}

}
