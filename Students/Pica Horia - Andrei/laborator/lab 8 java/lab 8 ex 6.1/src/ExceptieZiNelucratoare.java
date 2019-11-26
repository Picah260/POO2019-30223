
public class ExceptieZiNelucratoare extends Exception {
	String mesaj;

	public ExceptieZiNelucratoare(String mesaj) {
		super(mesaj);
		this.mesaj=mesaj;
	}

}
