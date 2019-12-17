import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Action2 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		String value1 = (String) Frame.combo.getSelectedItem();
		String value2 = (String) Frame.combo2.getSelectedItem();

		Frame.combo.setSelectedItem(value2);
		Frame.combo2.setSelectedItem(value1);

	}

}
