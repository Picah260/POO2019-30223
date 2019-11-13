package poocol;

import java.util.Arrays;

public class Angajat extends Persoana implements Comparable<Angajat> {
	public String dataAngajare;
	public int nrClienti;
	public Persoana[] pers;
	public Produs[] produs;

	public Angajat(int id, String name, String dataAngajare, int nrClienti)
 {
		super(id, name);
		this.dataAngajare = dataAngajare;
		this.nrClienti = nrClienti;
		//this.pers = new Persoana[5];
		//this.produs = new Produs[5];
	}

	// pt comparare

	public int compareTo(Angajat f) {
		if (this.nrClienti > f.nrClienti)
			return 1;
		if (this.nrClienti == f.nrClienti)
			return 0;
		return -1;

	}

	public String toString() {
		return "name= " + this.name + " " + this.nrClienti;
	}

}
