import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**Clasa Graphics tine loc de View in cadrul proiectului si in ea declaram componentele de interfata grafica JFrame si JPanel, pe langa astea mai folosim in proiect si componenta JButton.In cadrul clasei setam dimensiuniile si coordonatele fiecarei componenta*/
public class Graphics {
		
	
	static JFrame frame = new JFrame("Jocul Lui Nim");
	static JButton buton = new JButton("New Game");
	static JLabel label = new JLabel("Play");
	static JPanel panel = new JPanel();
	static JButton b1 = new JButton();
	static JButton b2 = new JButton();
	static JButton b3 = new JButton();
	static JButton b4 = new JButton();
	static JButton b5 = new JButton();
	static JButton b6 = new JButton();
	static JButton b7 = new JButton();
	static JButton b8 = new JButton();
	static JButton b9 = new JButton();
	static JButton b10 = new JButton();
	static JButton b11 = new JButton();
	static JButton b12 = new JButton();
	static JButton b13 = new JButton();
	static JButton b14 = new JButton();
	static JButton b15 = new JButton();
	static final int dim=50;
	
	public static void main(String[] args) {
		
		frame.setSize(400,600);
		frame.add(panel);
		panel.setLayout(null);
		buton.setBackground(Color.green);
		buton.addActionListener(new NewGameActionListener());
		buton.setBounds(50, 500, 250, 30);
		label.setLocation(50, 400);

		int x=dim;
		int y=250;
	
		b1.setBounds(x, y, dim, dim);
		
		b2.setBounds(x+dim, y, dim, dim);
		b3.setBounds(x+dim, y-dim, dim, dim);

		b4.setBounds(x+2*dim, y, dim, dim);
		b5.setBounds(x+2*dim, y-dim, dim, dim);
		b6.setBounds(x+2*dim, y-2*dim, dim, dim);

		b7.setBounds(x+3*dim, y, dim, dim);
		b8.setBounds(x+3*dim, y-dim, dim, dim);
		b9.setBounds(x+3*dim, y-2*dim, dim, dim);
		b10.setBounds(x+3*dim, y-3*dim, dim, dim);

		b11.setBounds(x+4*dim, y, dim, dim);
		b12.setBounds(x+4*dim, y-dim, dim, dim);
		b13.setBounds(x+4*dim, y-2*dim, dim, dim);
		b14.setBounds(x+4*dim, y-3*dim, dim, dim);
		b15.setBounds(x+4*dim, y-4*dim, dim, dim);
	
		
		b1.addMouseListener(new DissapearActionListener());
		b2.addMouseListener(new DissapearActionListener());
		b3.addMouseListener(new DissapearActionListener());
		b4.addMouseListener(new DissapearActionListener());
		b5.addMouseListener(new DissapearActionListener());
		b6.addMouseListener(new DissapearActionListener());
		b7.addMouseListener(new DissapearActionListener());
		b8.addMouseListener(new DissapearActionListener());
		b9.addMouseListener(new DissapearActionListener());
		b10.addMouseListener(new DissapearActionListener());
		b11.addMouseListener(new DissapearActionListener());
		b12.addMouseListener(new DissapearActionListener());
		b13.addMouseListener(new DissapearActionListener());
		b14.addMouseListener(new DissapearActionListener());
		b15.addMouseListener(new DissapearActionListener());
		
	 
		label.setFont( new Font("Courier", Font.BOLD,12));
		label.setBounds(x, y+dim*2,500,30);
		
		buton.doClick();
		
		
		frame.add(panel);
		panel.add(buton);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		panel.add(b7);
		panel.add(b8);
		panel.add(b9);
		panel.add(b10);
		panel.add(b11);
		panel.add(b12);
		panel.add(b13);
		panel.add(b14);
		panel.add(b15);
		panel.add(label);
		
		frame.setVisible(true);

	}

}