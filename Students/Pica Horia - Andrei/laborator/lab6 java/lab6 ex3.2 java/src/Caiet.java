
public class Caiet extends Rechizite {
Caiet(String eticheta)
{
	setEticheta(eticheta);
}
String getNume()
{
	return "Caiet de "+getEticheta();
	
}

}
