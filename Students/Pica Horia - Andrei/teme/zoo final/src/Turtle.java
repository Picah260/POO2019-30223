public class Turtle extends Reptile {

	public Turtle(Integer nrOfLegs, String name, double maintenanceCost, double dangerPerc, boolean takenCareOf,
			boolean laysEggs) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, takenCareOf, laysEggs);

	}

	public Turtle() {
		maintenanceCost = 0.2;
		dangerPerc = 0;
	}

}