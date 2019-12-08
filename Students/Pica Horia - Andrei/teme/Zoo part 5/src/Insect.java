import javax.xml.stream.XMLEventWriter;

public class Insect extends Animal {

	boolean canFly;

	boolean isDangerous;

	@Override
	protected void encodeToXml(XMLEventWriter eventWriter) {

	}

	@Override
	protected void createNode(XMLEventWriter eventWriter, String string, String valueOf) {
		public void encodeToXml(XMLEventWriter eventWriter1) throws XMLStreamException{
			super.encodeToXml(eventWriter);
			createNode(eventWriter, "canFly", String.valueOf(getCanFly()));
			createNode(eventWriter, "isDangerous", String.valueOf(getIsDangerous()));
			} 
		 
		 
	}
}
