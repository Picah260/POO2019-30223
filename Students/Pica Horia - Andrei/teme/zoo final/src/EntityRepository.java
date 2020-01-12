import java.io.FileNotFoundException;
import java.util.ArrayList;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

//import com.sun.java.util.jar.pack.Attribute.Layout.Element;

//package javasmmr.zoowsome.repositories;

public abstract class EntityRepository<T extends XML_Parsable> {

	private String xmlFilename;
	private String entityTag;

	public EntityRepository(String xmlFilename, String entityTag) {
		this.entityTag = "";
		this.xmlFilename = "";
		this.xmlFilename = xmlFilename;
		this.entityTag = entityTag;
	}

	

	public void save(ArrayList<T> entities) throws FileNotFoundException, XMLStreamException {

	}
	// for(XML_Parsable entitity:entities)
	// {

	// }
//	protected abstract T getEntityFromXmlElement(Element element);
//	for(int i = 0;i<nodeList.getLength();i++)
//	{
//		Node node = nodeList.item(i);
//		if (node.getNodeType() == Node.ELEMENT_NODE) {
//			Element element = (Element) node;
//			entities.add(getEntityFromXmlElement(element));
//		}
//	}

	public static void createNode(XMLEventWriter eventWriter, String name, String value) throws XMLStreamException { }
{
	
}

}