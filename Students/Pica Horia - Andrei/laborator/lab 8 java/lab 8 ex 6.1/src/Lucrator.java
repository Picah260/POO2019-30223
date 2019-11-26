
public class Lucrator {
	private String nume;
	private CalendarLucru calendar;

	public Lucrator(String nume, CalendarLucru calendar) {
		this.nume = nume;
		this.calendar = calendar;
	}

	public void lucreaza(String zi) throws ExceptieZiNelucratoare {
		
		for (int i = 0; i < 7; i++) {
			if (calendar.getZi(i).getNume().equals(zi))
				if (calendar.getZi(i).isLucratoare() == true) {
					System.out.println("Lucratorul " + nume + "lucreaza " + zi);
					return;}
			 else throw new ExceptieZiNelucratoare("Lucru in zi nelucratoare");
		}
		System.out.println(zi+" NU este o zi a saptamanii");	

	}

}
