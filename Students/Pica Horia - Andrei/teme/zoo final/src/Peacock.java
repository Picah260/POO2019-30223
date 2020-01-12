public class Peacock extends Bird {

	public Peacock(Integer nrOfLegs, String name, double maintenanceCost, double dangerPerc, boolean takenCareOf,
			boolean migrates, Integer avgFlightAltitude) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, takenCareOf, migrates, avgFlightAltitude);

	}

	public Peacock() {
		maintenanceCost = 0.5;
		dangerPerc = 5;

	}

}