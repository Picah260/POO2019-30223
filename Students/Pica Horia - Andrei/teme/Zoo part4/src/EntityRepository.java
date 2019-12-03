import java.io.FileNotFoundException;
import java.util.ArrayList;

import javax.xml.stream.XMLStreamException;

//package javasmmr.zoowsome.repositories;

public abstract class EntityRepository<T extends XML_Parsable> {

	private final String xmlFilename;
	private final String entityTag;

	public EntityRepository(String xmlFilename, String entityTag) {
		this.xmlFilename = xmlFilename;
		this.entityTag = entityTag;
	}

	public void save(ArrayList<T> entities) throws FileNotFoundException, XMLStreamException {

	}
	// for(XML_Parsable entitity:entities)
	// {

	// }
	protected abstract T getEntityFromXmlElement(Element element);
	for (int i = 0; i < nodeList.getLength(); i++) {
		Node node = nodeList.item(i);
		if (node.getNodeType() == Node.ELEMENT_NODE) {
		Element element = (Element) node;
		entities.add(getEntityFromXmlElement(element));
		}
		}
	public static void createNode(XMLEventWriter eventWriter, String name, String
			value) throws XMLStreamException { … }
}