import java.awt.Color;

public class Card {
public String suit;
private String number;
Color culoare;
public Card(String suit, String number, Color culoare) {
	this.suit = suit;
	this.number = number;
	this.culoare = culoare;
}

void printCard()
{
	System.out.printf("%s %s %s\n",suit,number,culoare.toString());

}

}
