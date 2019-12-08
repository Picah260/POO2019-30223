import java.math.BigDecimal;

public class MainContoller {

	public static void main(String[] args) {
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1;

		try {
			speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
			Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Cow);
			System.out.printf("We have an animal with %d legs! \n", a1.getNrOfLegs());
			Animal[] animal = new Animal[3];
			Caretaker[] caretaker = new Caretaker[3];
			animal[0] = new Cow();
			animal[1] = new Bird();
			animal[2] = new Butterfly();
			caretaker[0] = new Caretaker("Popescu", BigDecimal.valueOf(12000));
			caretaker[1] = new Caretaker("Vasile", BigDecimal.valueOf(15000));
			caretaker[2] = new Caretaker("Andrei", BigDecimal.valueOf(77000));
			for (int i = 0; i < 3; i++)
				for (int j = 0; j < 3; j++) {
					if (caretaker[i].getisDead() == false && animal[j].isTakenCareOf() == false) {
						String result = caretaker[i].takeCareOf(animal[i]);

						if (result.equals(Constants.Employees.Caretakers.TCO_KILLED))
							caretaker[i].setisDead(true);
						else if (result.equals(Constants.Employees.Caretakers.TCO_NO_TIME))
							continue;
						else
							animal[j].setTakenCareOf(true);
					}
				}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}