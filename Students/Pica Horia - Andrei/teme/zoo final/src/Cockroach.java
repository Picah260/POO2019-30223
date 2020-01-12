public class Cockroach extends Insect {

	public Cockroach(Integer nrOfLegs, String name, double maintenanceCost, double dangerPerc, boolean takenCareOf,
			boolean canFly, boolean isDangerous) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, takenCareOf, canFly, isDangerous);
	}

	public Cockroach() {
		maintenanceCost = 0.25;
		dangerPerc = 10;
	}

}