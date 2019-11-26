
public class MyException extends Exception {
	private String mesaj;

	public MyException(String mesaj) {
		super(mesaj);
		this.mesaj=mesaj;
	}

}
