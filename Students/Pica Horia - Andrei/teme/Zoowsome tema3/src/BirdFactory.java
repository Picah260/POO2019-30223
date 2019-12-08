public class BirdFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {
		if (Constants.Animals.Birds.Crow.equals(type)) {
			return new Crow();
		} else if (Constants.Animals.Birds.Swallow.equals(type)) {
			return new Swallow();
		} else if (Constants.Animals.Birds.Peacock.equals(type)) {
			return new Peacock();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}

}