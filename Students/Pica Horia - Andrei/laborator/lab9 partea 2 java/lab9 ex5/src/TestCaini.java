import java.awt.Color;

public class TestCaini {

	public static void main(String[] args) {
	Pet p=new Pet("Tasha",2,"Negru","Labrador Retriver");
	Pet p1=new Pet("Cody",14,"Gold","Fara rasa");
	PetHotel h=new PetHotel(5);
	h.addCaine(p,1);
    h.addCaine(p1,2);
	h.stergeCaine(p1,2);
	h.printCaine();

	

	}

}
