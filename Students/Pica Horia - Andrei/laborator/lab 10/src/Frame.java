import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.AbstractButton;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
public class Frame {
	public static GettingCurrentDate date = new GettingCurrentDate();
	public static JLabel labeldate = new JLabel();
	public static String[] money = { "EUR", "USD", "RON" };
	public static JFrame frame = new JFrame("Calculator schimb valutar");
	public static JPanel panel = new JPanel();
	public static JComboBox combo = new JComboBox(money);
	public static JComboBox combo2 = new JComboBox(money);
	public static JButton buton = new JButton("Converteste acum====>");
	public static JTextField text = new JTextField();
	public static JTextField text1 = new JTextField();
	public static JLabel label = new JLabel("Suma : ");
	public static JLabel label2 = new JLabel("Rezultat : ");
	public static JLabel label3 = new JLabel("1 EUR = " + ExchangeRate.LEI_TO_EURO + "RON");
	public static JLabel label4 = new JLabel("1 USD = 4,3124 RON");
	public static JLabel label5 = new JLabel("1EUR = 1,1083 USD");
	public static JLabel label6 = new JLabel("1USD = 0,9023 EUR");
	public static JButton buton2 = new JButton("Reverse");

	public static void main(String[] args) {
		try {
			ExchangeRate obj = new ExchangeRate();
		} catch (Exception exc) {
		}

		panel.setBackground(new Color(102, 255, 153));
		buton.setBackground(new Color(0, 255, 255));
		combo.setBackground(new Color(255, 153, 0));
		combo2.setBackground(new Color(255, 153, 0));
		text.setBackground(new Color(255, 204, 0));
		text1.setBackground(new Color(255, 204, 0));
		buton2.setBackground(new Color(0, 255, 255));
		text.setPreferredSize(new Dimension(150, 30));
		text1.setPreferredSize(new Dimension(150, 30));
		text.setFont(new Font("Jokerman", Font.BOLD, 20));
		text1.setFont(new Font("Jokerman", Font.BOLD, 20));
		combo.setSelectedIndex(2);
		combo2.setSelectedItem(2);
		frame.setSize(750, 150);
		frame.add(panel);
		combo.setSize(200, 200);
		panel.add(label);
		panel.add(text);
		panel.add(combo);
		panel.add(buton);
		panel.add(label2);
		panel.add(text1);
		panel.add(combo2);
		buton.addActionListener(new Action());
		label3.setText("1 EUR = " + ExchangeRate.LEI_TO_EURO + "RON");
		label4.setText("1 USD= " + ExchangeRate.LEI_TO_USD + "RON");
		label5.setText("1 EUR = " + String.format("%.4f", ExchangeRate.EURO_TO_USD) + "USD");
		label6.setText("1 USD = " + String.format("%.4f", ExchangeRate.USD_TO_EURO) + "EUR");
		panel.add(label3);
		panel.add(label4);
		panel.add(label5);
		panel.add(label6);
		panel.add(buton2);
		panel.add(labeldate);
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		Date dateobj = new Date();
		Calendar calobj = Calendar.getInstance();
		Frame.labeldate.setText(df.format(calobj.getTime()));
		buton2.addActionListener(new Action2());
		frame.setVisible(true);

	}

}
