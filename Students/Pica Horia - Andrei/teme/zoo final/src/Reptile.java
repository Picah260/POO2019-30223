 public abstract class Reptile  extends Animal{
	
	boolean laysEggs;

	public Reptile(Integer nrOfLegs, String name, double maintenanceCost, double dangerPerc, boolean takenCareOf,
			boolean laysEggs) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, takenCareOf);
		this.laysEggs = laysEggs;
	}
	
	public Reptile() {
		 maintenanceCost=0;
		 dangerPerc=0 ;
		
	}

}