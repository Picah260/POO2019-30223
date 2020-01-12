public class Spider extends Insect {

	public Spider(Integer nrOfLegs, String name, double maintenanceCost, double dangerPerc, boolean takenCareOf,
			boolean canFly, boolean isDangerous) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, takenCareOf, canFly, isDangerous);
	}

	public Spider() {
		maintenanceCost = 0.1;
		dangerPerc = 50;
	}

}