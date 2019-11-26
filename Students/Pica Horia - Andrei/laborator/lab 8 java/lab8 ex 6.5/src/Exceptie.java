
public class Exceptie extends Exception {
	private String s;

	public Exceptie(String s) {
		this.s = s;
	}

	public String toString() {
		return "Exceptia este : = " + this.s;
	}

}
