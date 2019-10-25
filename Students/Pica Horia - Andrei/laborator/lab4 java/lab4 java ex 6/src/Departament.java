public class Departament {
	private String nume_dep;
	private String nume;
	private int locuri_alocate;
	private String nume_manager;
	private int profit_dep;
	private int nr_oameni_concediu;
	private long cifra_de_afaceri;
Departament()
{
	nume_dep="Resurse umane";
	nume="George";
	locuri_alocate=156;
	nume_manager="Pica Horia";
	profit_dep=2000;
	nr_oameni_concediu=19;
	cifra_de_afaceri=1992929299;
}
	public void setCifra(long cifra1) {
		cifra_de_afaceri = cifra1;
	}

	public long getCifra() {
		return cifra_de_afaceri;
	}

	public void setnume(String nume1) {
		nume = nume1;
	}

	public String getnume() {
		return nume;
	}

	public void setnume_dep(String nume2) {
		nume = nume2;
	}

	public String getnume_dep() {
		return nume_dep;
	}

	public void setlocuri(int locuri1) {
		locuri_alocate = locuri1;
	}

	public int getlocuri() {
		return locuri_alocate;
	}

	public void setnume_manager(String nume1) {
		nume = nume1;
	}

	public String getnume_manager() {
		return nume_manager;
	}

	public void setprofit(int profit1) {
		profit_dep = profit1;
	}

	public int getprofit() {
		return profit_dep;
	}

	public void setoameni(int oameni1) {
		nr_oameni_concediu = oameni1;
	}

	public int getoameni() {
		return nr_oameni_concediu;
	}


}
