public class Monkey extends Mammal {

	public Monkey(Integer nrOfLegs, String name, double maintenanceCost, double dangerPerc, boolean takenCareOf,
			float normalBodyTemp, float percBodyTemp) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, takenCareOf, normalBodyTemp, percBodyTemp);
	}

	public Monkey() {
		maintenanceCost = 0.6;
		dangerPerc = 10;
	}

}