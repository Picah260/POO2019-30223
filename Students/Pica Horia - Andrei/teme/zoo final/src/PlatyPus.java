public class PlatyPus extends Aquatic {

	public PlatyPus(Integer nrOfLegs, String name, double maintenanceCost, double dangerPerc, boolean takenCareOf,
			Integer avgSwimDepth, Type waterType) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, takenCareOf, avgSwimDepth, waterType);

	}

	public PlatyPus() {
		maintenanceCost = 0.9;
		dangerPerc = 15;
	}

}