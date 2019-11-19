import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class DissapearActionListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				((JButton)e.getSource()).setVisible(false);		
			}	
		}
