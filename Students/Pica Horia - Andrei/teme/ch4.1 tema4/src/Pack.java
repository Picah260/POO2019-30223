import java.awt.Color;
import java.util.Iterator;

public class Pack implements Iterator<Card> {
Card[] array;
public int nr;
public int poz;

Pack()
{
	this.nr=13;
	this.poz=0;
	 array = new Card[]
			{
			new Card("hearts","2",Color.black),
			new Card("hearts","3",Color.black),
			new Card("hearts","4",Color.black),
			new Card("hearts","5",Color.black),
			new Card("hearts","6",Color.black),
			new Card("hearts","7",Color.black),
			new Card("hearts","8",Color.black),
			new Card("hearts","9",Color.black),
			new Card("hearts","10",Color.black),
			new Card("hearts","J",Color.black),
			new Card("hearts","Q",Color.black),
			new Card("hearts","K",Color.black),
	        new Card("hearts","A",Color.black)};
	
}
public boolean hasNext()
{
	if(poz>=nr)
	return false;
	else
	return true;
	
}

	public Card next() {
	if(hasNext())
	return array[++poz];
	else
		return new Card(null,"0",Color.black);

	}
public void remove()
{
	array[poz--]=new Card(null,"0",Color.black);
	
}

	public static void main(String[] args) {
		Pack p = new Pack();
		p.array[0].printCard();
		p.next().printCard();
		p.remove();
		

	}

}
