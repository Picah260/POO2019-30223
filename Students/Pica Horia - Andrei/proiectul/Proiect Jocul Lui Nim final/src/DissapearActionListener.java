import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;
/** tine loc de Controler In clasa DissapearActionListener,care tine loc de Controller  avem actiuniile care pot avea loc asupra butoanelor din joc.*/
public class DissapearActionListener implements MouseListener {
 
	private ArrayList<JButton> buttons = new ArrayList<JButton>();
	static public Player player1 = new Player("player1", true);
	static public Player player2 = new Player("player2", false);

	static boolean endGame() {
		if (Graphics.b1.isVisible())
			return false;
		if (Graphics.b2.isVisible())
			return false;
		if (Graphics.b3.isVisible())
			return false;
		if (Graphics.b4.isVisible())
			return false;
		if (Graphics.b5.isVisible())
			return false;
		if (Graphics.b6.isVisible())
			return false;
		if (Graphics.b7.isVisible())
			return false;
		if (Graphics.b8.isVisible())
			return false;
		if (Graphics.b9.isVisible())
			return false;
		if (Graphics.b10.isVisible())
			return false;
		if (Graphics.b11.isVisible())
			return false;
		if (Graphics.b12.isVisible())
			return false;
		if (Graphics.b13.isVisible())
			return false;
		if (Graphics.b14.isVisible())
			return false;
		if (Graphics.b15.isVisible())
			return false;
		return true;
	}

	
	@Override
	public void mouseEntered(MouseEvent e) {
		JButton b = (JButton) e.getSource();

		if (b.equals(Graphics.b1)) {
			buttons.add(Graphics.b1);
		}
		if (b.equals(Graphics.b2)) {
			buttons.add(Graphics.b2);
			buttons.add(Graphics.b3);
		}

		if (b.equals(Graphics.b3)) {
			buttons.add(Graphics.b3);
		}

		if (b.equals(Graphics.b4)) {
			buttons.add(Graphics.b4);
			buttons.add(Graphics.b5);
			buttons.add(Graphics.b6);

		}
		if (b.equals(Graphics.b5)) {
			buttons.add(Graphics.b5);
			buttons.add(Graphics.b6);
		}
		if (b.equals(Graphics.b6)) {
			buttons.add(Graphics.b6);

		}
		if (b.equals(Graphics.b7)) {
			buttons.add(Graphics.b7);
			buttons.add(Graphics.b8);
			buttons.add(Graphics.b9);
			buttons.add(Graphics.b10);
		}
		if (b.equals(Graphics.b8)) {
			buttons.add(Graphics.b8);
			buttons.add(Graphics.b9);
			buttons.add(Graphics.b10);

		}
		if (b.equals(Graphics.b9)) {
			buttons.add(Graphics.b9);
			buttons.add(Graphics.b10);

		}
		if (b.equals(Graphics.b10)) {
			buttons.add(Graphics.b10);

		}

		if (b.equals(Graphics.b11)) {
			buttons.add(Graphics.b11);
			buttons.add(Graphics.b12);
			buttons.add(Graphics.b13);
			buttons.add(Graphics.b14);
			buttons.add(Graphics.b15);
		}

		if (b.equals(Graphics.b12)) {
			buttons.add(Graphics.b12);
			buttons.add(Graphics.b13);
			buttons.add(Graphics.b14);
			buttons.add(Graphics.b15);
		}

		if (b.equals(Graphics.b13)) {
			buttons.add(Graphics.b13);
			buttons.add(Graphics.b14);
			buttons.add(Graphics.b15);

		}

		if (b.equals(Graphics.b14)) {
			buttons.add(Graphics.b14);
			buttons.add(Graphics.b15);
		}
		if (b.equals(Graphics.b15)) {
			buttons.add(Graphics.b15);
		}

		for (JButton p : buttons)
			p.setBackground(new Color(53, 53, 196));
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		for (JButton b : buttons)
			b.setVisible(false);

		if (endGame()!=false) {
			if (player1.getTurn())
				JOptionPane.showMessageDialog(Graphics.frame, player1.getName() + " a castigat ");
			else
				JOptionPane.showMessageDialog(Graphics.frame, player2.getName() + " a castigat ");

			Graphics.buton.doClick();
		} else {
			player1.changeTurn();
			player2.changeTurn();

			if (DissapearActionListener.player1.getTurn() == true)
				Graphics.label.setText(DissapearActionListener.player1.getName() + " turns");
			else
				Graphics.label.setText(DissapearActionListener.player2.getName() + " turns");
		}

	}


	@Override
	public void mouseExited(MouseEvent e) {

		for (JButton b : buttons)
			b.setBackground(null);

		buttons.clear();
	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}
}