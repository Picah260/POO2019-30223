public class Cow extends Mammal {

	public Cow(Integer nrOfLegs, String name, double maintenanceCost, double dangerPerc, boolean takenCareOf,
			float normalBodyTemp, float percBodyTemp) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, takenCareOf, normalBodyTemp, percBodyTemp);

	}

	public Cow() {
		maintenanceCost = 0.9;
		dangerPerc = 65;
	}

}