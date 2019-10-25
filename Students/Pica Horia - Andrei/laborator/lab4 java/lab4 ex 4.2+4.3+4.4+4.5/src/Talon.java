import java.sql.Date;
import java.time.format.DateTimeFormatter;

public class Talon {
public int an_fabricatie;
public String serie_sasiu;
public DateTimeFormatter data_itp;
public DateTimeFormatter data_schimb_filtru_ulei;
public String nume_proprietar;
public String drept_vanzare;
Talon()
{
	an_fabricatie=2019;
	serie_sasiu="WAUZZZ4G3FN092416";
	data_itp=DateTimeFormatter.ofPattern("22/03/2021");
	data_schimb_filtru_ulei=DateTimeFormatter.ofPattern("22/03/2021");
	nume_proprietar="Pica Horia-Andrei";
	drept_vanzare="DA";
	
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
