import javax.xml.stream.XMLEventWriter;

enum Type {
	SALTWATER, FRESHWATER
}

public class Aquatic extends Animal {

	Integer avgSwimDepth;

	Type waterType;

	@Override
	protected void encodeToXml(XMLEventWriter eventWriter) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void createNode(XMLEventWriter eventWriter, String string, String valueOf) {
		// TODO Auto-generated method stub
		
	}

}
 