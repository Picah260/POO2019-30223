public class Bird extends Animal {
	boolean migrates;
	Integer avgFlightAltitude;

	public Bird(Integer nrOfLegs, String name, double maintenanceCost, double dangerPerc, boolean takenCareOf,
			boolean migrates, Integer avgFlightAltitude) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, takenCareOf);
		this.migrates = migrates;
		this.avgFlightAltitude = avgFlightAltitude;
	}

	public Bird() {
		maintenanceCost =0.2;
		dangerPerc = 5;

	}

}