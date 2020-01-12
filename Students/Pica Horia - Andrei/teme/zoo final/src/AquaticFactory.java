public class AquaticFactory extends SpeciesFactory {

	@Override
	public Animal getAnimal(String type) throws Exception {

		if (Constants.Animals.Aquatics.Platypus.equals(type)) {
			return new PlatyPus();
		} else if (Constants.Animals.Aquatics.Fish.equals(type)) {
			return new Fish();
		} else if (Constants.Animals.Aquatics.Shark.equals(type)) {
			return new Shark();
		} else {
			throw new Exception("Invalid animal exception!");
		}
	}

}