enum Type {
	SALTEDWATER, FRESH
};

public class Aquatic extends Animal {

	Integer avgSwimDepth;
	Type waterType;

	public Aquatic(Integer nrOfLegs, String name, double maintenanceCost, double dangerPerc, boolean takenCareOf,
			Integer avgSwimDepth, Type waterType) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, takenCareOf);
		this.avgSwimDepth = avgSwimDepth;
		this.waterType = waterType;
	}

	public Aquatic() {
	maintenanceCost = 0;
	dangerPerc = 0;
	}
}
