
public class MainClass {

	public static void main(String[] args) {
		Lucrator lucrator = new Lucrator("Gigel ", new CalendarLucru());
		try {
			lucrator.lucreaza("Luni");
			lucrator.lucreaza("Marte");
			lucrator.lucreaza("Duminica");
		} catch (ExceptieZiNelucratoare e) {
			System.out.println(e);
		}

	}

}
