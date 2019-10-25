public class Person {
	private String nume;
	private String prenume;
	private int salar;
	private String grad;
	private int vechime;
	Departament d = new Departament();
	DatePers pers = new DatePers();

	Person() {
		nume = "Pica";
		prenume = "Horia-Andrei";
		salar = 30000;
		grad = "Manager departament Resurse Umane";
		vechime = 10;

	}

	public void setnume(String nume1) {
		nume = nume1;
	}

	public String getnume() {
		return nume;
	}

	public void setprenume(String prenume1) {
		prenume = prenume1;
	}

	public String getprenume() {
		return prenume;
	}

	public void setsalar(int salar1) {
		salar = salar1;
	}

	public int getsalar() {
		return salar;
	}

	public void setgrad(String grad1) {
		grad = grad1;
	}

	public String getgrad() {
		return grad;
	}

	public void setvechime(int vechime1) {
		vechime = vechime1;
	}

	public int getvechime() {
		return vechime;
	}

	public static void main(String[] args) {
		Person p = new Person();
		System.out.println("Numele este:" + p.getnume());
		System.out.println("Prenumele este:" + p.getprenume());
		System.out.println("Salarul este : =" + p.getsalar() + "euro");
		System.out.println("Gradul este : = " + p.getgrad());
		System.out.println("Vechimea este de " + p.getvechime() + "ani");
		System.out.println("Numele este:" + p.d.getnume());
		System.out.println("Nume departament :" + p.d.getnume_dep());
		System.out.println("Nume manager departament : =" + p.d.getnume_manager());
		System.out.println("Nr de oameni este  : = " + p.d.getlocuri());
		System.out.println("Nr de oameni in concediu este : " + p.d.getoameni());
		System.out.println("Profit departament : = " + p.d.getprofit() + " euro pe luna");
		System.out.println("Cifra de afaceri este  : = " + p.d.getCifra() + " milioane de euro pe an");

		System.out.println("Numele persoanei este : = " + p.pers.nume);
		System.out.println("Adresa pe care locuieste este  : " + p.pers.adresa);
		System.out.println("CNP : = " + p.pers.cnp);
		System.out.println("Varsta este : = " + p.pers.varsta);
		System.out.println("IBAN-ul este : =" + p.pers.iban);
		// TODO Auto-generated method stub

	}

}
