public class Mammal extends Animal {
	float normalBodyTemp;
	float percBodyTemp;

	public Mammal(Integer nrOfLegs, String name, double maintenanceCost, double dangerPerc, boolean takenCareOf,
			float normalBodyTemp, float percBodyTemp) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, takenCareOf);
		this.normalBodyTemp = normalBodyTemp;
		this.percBodyTemp = percBodyTemp;
	}

	public Mammal() {
		maintenanceCost = 0;
		dangerPerc = 0;
	}

}