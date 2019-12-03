public abstract class Animal implements Killer {

	private Integer nrOfLegs;

	private String name;
	private final double maintenanceCost = 0;
	private final double dangerPerc = 0;
	private boolean takenCareOf = false;

	public Integer getNrOfLegs() {

		return nrOfLegs;

	}

	public void setNrOfLegs(Integer nrOfLegs) {

		this.nrOfLegs = nrOfLegs;

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public boolean isTakenCareOf() {
		return takenCareOf;
	}

	public void setTakenCareOf(boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}

	public double getMaintenanceCost() {
		return maintenanceCost;
	}

	public double getDangerPerc() {
		return dangerPerc;
	}

	public boolean kill() {
		if (dangerPerc > Math.random())
			return true;
		return false;

	}
}