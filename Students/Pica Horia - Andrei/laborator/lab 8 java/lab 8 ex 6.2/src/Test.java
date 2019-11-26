
public class Test {

	public static void main(String[] args) {
		Object obj = null;
		try {
			obj.notify();
		} catch (NullPointerException e) {
			System.out.println("Exceptia NullPointerException a fost prinsa");
		}

	}

}
