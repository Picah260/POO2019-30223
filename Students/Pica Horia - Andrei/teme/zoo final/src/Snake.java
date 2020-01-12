public class Snake extends Reptile {

	public Snake(Integer nrOfLegs, String name, double maintenanceCost, double dangerPerc, boolean takenCareOf,
			boolean laysEggs) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, takenCareOf, laysEggs);

	}

	public Snake() {
		maintenanceCost = 0.8;
		dangerPerc = 98;
	}

}