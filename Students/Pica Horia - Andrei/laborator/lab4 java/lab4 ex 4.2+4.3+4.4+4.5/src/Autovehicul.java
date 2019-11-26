import java.awt.Color;

public class Autovehicul {
	private String marca;
	private Color culoare;
	private int viteza_curenta;
	private int treapta_viteza_curenta;
	private int viteza_maxima;
	public int an_fabricatie;
	public Sofer s = new Sofer();
	public Motor m=new Motor();
	public Talon t=new Talon();

	// private se face cu set get
	Autovehicul() {
		marca = "Ford Focus RS";
		culoare = Color.BLUE;
		viteza_curenta = 100;
		treapta_viteza_curenta = 3;
		viteza_maxima = 300;
		an_fabricatie=2019;
		

	}
	//constructor supraincarcat

	Autovehicul(String marca) {
		this.marca = marca;
	}

	public void setMarca(String marca1) {
		marca = marca1;
	}

	public String getMarca() {
		return marca;
	}

	public void setCuloare(Color culoare1) {
		culoare = culoare1;
	}

	public Color getColor() {
		return culoare;
	}

	public void setVit_curenta(int viteza) {
		viteza_curenta = viteza;
	}

	public int getViteza() {
		return viteza_curenta;
	}

	public void settreapta_curenta(int treapta) {
		treapta_viteza_curenta = treapta;
	}

	public int gettreapta() {
		return treapta_viteza_curenta;
	}

	public void setviteza_max(int vmax) {
		viteza_maxima = vmax;
	}

	public int getVitezamax() {
		return viteza_maxima;
	}

	public void acelereaza(int nr_kmh) {
		if (viteza_curenta + nr_kmh > viteza_maxima)
			viteza_curenta = viteza_maxima;
		viteza_curenta += nr_kmh;

	}

	public void pune_frana(int nr_kmh1) {
		if(viteza_curenta-nr_kmh1<0)
		viteza_curenta=0;
		else
		viteza_curenta -= nr_kmh1;
	}

	public void schimba_treapta(int treapta) {
		if(treapta>6)
		treapta_viteza_curenta=6;
		else
		treapta_viteza_curenta = treapta;
	}

	public void opreste_motorul() {
		viteza_curenta = 0;
		treapta_viteza_curenta = 1;
	}
	public void drum()
	{
		System.out.println();
		opreste_motorul();
		acelereaza(180);
		schimba_treapta(6);
		System.out.println("Viteza dupa acelerare este : ="+getViteza()+"km/h");
		pune_frana(100);
		schimba_treapta(3);
		System.out.println("Viteza dupa decelerare este : ="+getViteza()+"km/h");

		System.out.println("Treapta de viteza este : ="+gettreapta());
		opreste_motorul();
		System.out.println("Viteza dupa oprire este : ="+getViteza()+"km/h");
		
	}

	public static void main(String[] args) {
	Autovehicul masina=new Autovehicul();
        masina.drum();
	System.out.println("Marca masina este : = "+masina.getMarca());
	System.out.println("Masina este in treapta : = "+ masina.gettreapta());
	System.out.println("Viteza curenta este  : ="+ masina.getViteza()+"km/h");
	masina.acelereaza(150);
	System.out.println("Calcam acelaratia :  Masina are viteza "+masina.getViteza()+"km/h");
	System.out.println("Masina atinge viteza "+masina.getVitezamax()+"km/h");
	drum(masina);
	int distanta=100;
	System.out.println("Distanta parcursa este "+distanta+"km");
	System.out.println("An fabricatie este : ="+masina.an_fabricatie);
	System.out.println("Nume sofer : = "+masina.s.nume);
	System.out.println("PreNume sofer : = "+masina.s.prenume);
	System.out.println("Varsta sofer : = "+masina.s.varsta);
	System.out.println("Serie permis sofer : = "+masina.s.nr_permis_de_conducere);
	System.out.println("An fabricatie este : ="+masina.an_fabricatie);
	System.out.println("Motorul este in"+masina.m.nr_cilindri+"cilindri");
	System.out.println("Motorul are"+masina.m.cai_putere+"cai putere");
	System.out.println("Masina este pe "+masina.m.combustibil);
	System.out.println("Motorul masinii este de "+masina.m.volum);
	System.out.println("Tractiunea masinii este "+masina.m.tractiune);
    System.out.println("An fabricatie este"+masina.t.an_fabricatie);
    System.out.println("Numele proprietar este "+masina.t.nume_proprietar);
    System.out.println("Drept de vanzare : ="+masina.t.drept_vanzare);
    System.out.println("Data schimb filtru de ulei "+masina.t.data_schimb_filtru_ulei);
    System.out.println("Data itp este "+masina.t.data_itp);
    System.out.println("Seria de sasiu este : ="+masina.t.serie_sasiu);
		// TODO Auto-generated method stub

	}

}
