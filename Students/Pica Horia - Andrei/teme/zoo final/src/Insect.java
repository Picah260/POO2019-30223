import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public class Insect extends Animal{
	boolean canFly;
	boolean isDangerous;

	
	public Insect(Integer nrOfLegs, String name, double maintenanceCost, double dangerPerc, boolean takenCareOf,
			boolean canFly, boolean isDangerous) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, takenCareOf);
		this.canFly = canFly;
		this.isDangerous = isDangerous;
	}
	
	public Insect() {
		maintenanceCost=0;
		 dangerPerc=0 ;
	}
	

	@Override
	public void decodeFromXml(Element element) {
		
		
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException 
	{   super.encodeToXml(eventWriter);   
	createNode(eventWriter, "canFly", String.valueOf(getCanFly())); 
	createNode(eventWriter, "isDangerous", String.valueOf(getIsDangerous())); 
	}

	private char[] getIsDangerous() {
		return null;
	}

	private char[] getCanFly() {
		return null;
	} 
	 
	 

}