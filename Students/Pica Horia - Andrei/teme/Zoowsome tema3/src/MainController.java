public class MainController {
public static void main(String[] args) { 
AnimalFactory abstractFactory = new AnimalFactory(); 
SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Cat);
System.out.printf("We have an animal with %d legs!\n ", a1.getNrOfLegs()); 
			 
			 }
	// TODO Auto-generated method stub

}
