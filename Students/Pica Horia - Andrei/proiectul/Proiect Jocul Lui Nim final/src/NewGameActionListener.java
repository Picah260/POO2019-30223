import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
/**	Tine loc de Controler In clasa NewGameActionListener lucram pentru butonul New Game care odata ce este apasat seteaza toate butoanele initiale pe vizibil.*/
public class NewGameActionListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		 Graphics.b1.setVisible(true);
		 Graphics.b2.setVisible(true);
		 Graphics.b3.setVisible(true);
		 Graphics.b4.setVisible(true);
		 Graphics.b5.setVisible(true);
		 Graphics.b6.setVisible(true);
		 Graphics.b7.setVisible(true);
		 Graphics.b8.setVisible(true);
		 Graphics.b9.setVisible(true);
		 Graphics.b10.setVisible(true);
		 Graphics.b11.setVisible(true);
		 Graphics.b12.setVisible(true);
		 Graphics.b13.setVisible(true);
		 Graphics.b14.setVisible(true);
		 Graphics.b15.setVisible(true);
		
		 if (DissapearActionListener.player1.getTurn()==true)
			    Graphics.label.setText(DissapearActionListener.player1.getName()+"  begins");
		 else  Graphics.label.setText(DissapearActionListener.player2.getName()+"  begins");
	}	
}