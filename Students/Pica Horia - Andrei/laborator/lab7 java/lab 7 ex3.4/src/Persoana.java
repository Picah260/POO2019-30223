
public class Persoana implements Comparable<Persoana> {
	private String nume;
	private String prenume;
	private int varsta;

	public Persoana(String nume, String prenume, int varsta) {

		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
	}

	public String toString() {
		return "nume= " + this.nume + " " + "prenume= " + this.prenume + " varsta=" + this.varsta;
	}

	// varsta
	
	public int compareTo(Persoana p1) { 
	if(this.varsta==p1.varsta)
	return 0;
	 if(this.varsta>p1.varsta)
	return 1;
	return -1;
	 
	 }
	 
	// alfabetic
	//public int compareTo(Persoana p1) {
		//return this.nume.compareTo(p1.nume);

	}


