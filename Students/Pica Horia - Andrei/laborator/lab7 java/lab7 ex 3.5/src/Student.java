import java.awt.Color;

public class Student implements Cloneable {
	private String nume;
	private String prenume;
	private Masina m;

	public Student(String nume, String prenume, Masina m) {
		this.nume = nume;
		this.prenume = prenume;
		this.m = m;
	}

	public String getNume() {
		return nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public Masina getM() {
		return m;
	}

	public Student deepcoppy() {
		return new Student(this.nume, this.prenume, this.m.deepcoppy());
	}

	public Student shallowcoppy() {
		return this;
	}

}
