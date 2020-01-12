public class Crocodille extends Reptile {

	public Crocodille(Integer nrOfLegs, String name, double maintenanceCost, double dangerPerc, boolean takenCareOf,
			boolean laysEggs) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, takenCareOf, laysEggs);

	}

	public Crocodille() {
		maintenanceCost = 0.85;
		dangerPerc = 99;
	}

}