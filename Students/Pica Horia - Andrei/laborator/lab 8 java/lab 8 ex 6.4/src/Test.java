
public class Test {
	public static void main(String[] args) {
		try {
			throw new Exception("Da");

		} catch (Exception e) {
			System.out.println(e);

		} finally {
			System.out.println("Buna seara,Doamne ajuta!");

		}

	}

}
