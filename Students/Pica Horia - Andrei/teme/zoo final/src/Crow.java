public class Crow extends Bird {

	public Crow(Integer nrOfLegs, String name, double maintenanceCost, double dangerPerc, boolean takenCareOf,
			boolean migrates, Integer avgFlightAltitude) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, takenCareOf, migrates, avgFlightAltitude);

	}

	public Crow() {
		maintenanceCost = 0.5;
		dangerPerc = 5;
	}

}