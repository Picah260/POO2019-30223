import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

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

	protected abstract void encodeToXml(XMLEventWriter eventWriter);

	public void encodeToXml1(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter, "nrOfLegs", String.valueOf(this.nrOfLegs));
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "maintenanceCost", String.valueOf(this.maintenanceCost));
		createNode(eventWriter, "dangerPerc", String.valueOf(this.dangerPerc));
		createNode(eventWriter, "takenCareOf", String.valueOf(this.takenCareOf));
	}

	protected abstract void createNode(XMLEventWriter eventWriter, String string, String valueOf);
}