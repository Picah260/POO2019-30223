public class InsectFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Insects.Butterfly.equals(type)) {
			return new Butterfly();
		} else if (Constants.Animals.Insects.Cockroach.equals(type)) {
			return new Cockroach();
		} else if (Constants.Animals.Insects.Spider.equals(type)) {
			return new Spider();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}

}