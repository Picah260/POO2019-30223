public class Pet {
private String nume;
private int varsta;
private String culoare;
private String rasa;
public Pet(String nume, int varsta, String culoare, String rasa) {
	this.nume = nume;
	this.varsta = varsta;
	this.culoare = culoare;
	this.rasa = rasa;
}
public Pet() {
	
}
@Override
public String toString() {
	return "Pet [nume=" + nume + ", varsta=" + varsta + ", culoare=" + culoare + ", rasa=" + rasa + "]";
}


   

}
