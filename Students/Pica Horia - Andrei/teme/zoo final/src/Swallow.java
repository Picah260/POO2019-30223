public class Swallow extends Animal {
	boolean migrates;
	Integer avgFlightAltitude;

	public Swallow(Integer nrOfLegs, String name, double maintenanceCost, double dangerPerc, boolean takenCareOf,
			boolean migrates, Integer avgFlightAltitude) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, takenCareOf);
		this.migrates = migrates;
		this.avgFlightAltitude = avgFlightAltitude;
	}

	public Swallow() {
		maintenanceCost = 0.7;
		dangerPerc = 10;

	}

}