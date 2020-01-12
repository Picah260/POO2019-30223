public class Tiger extends Mammal {

	public Tiger(Integer nrOfLegs, String name, double maintenanceCost, double dangerPerc, boolean takenCareOf,
			float normalBodyTemp, float percBodyTemp) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, takenCareOf, normalBodyTemp, percBodyTemp);

	}

	public Tiger() {
		maintenanceCost = 0.6;
		dangerPerc = 50;
	}

}