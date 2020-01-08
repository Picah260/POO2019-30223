  /**Tine loc de Model In clasa Player,care tine loc de Model care are 2 atribute Nume si Turn.
Turn reprezinta daca este sau nu randul lui la mutare.
 */
public class Player {

	private String name;
	private boolean turn;
	
	
	public Player(String name, boolean turn) {
		this.name = name;
		this.turn = turn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getTurn() {
		return turn;
	}

	public void changeTurn() {
		turn =  ! turn;
	}

}