import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Action implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

		try {
			ExchangeRate obj = new ExchangeRate();
		} catch (Exception exc) {
		}
		double LEI_TO_EURO = ExchangeRate.LEI_TO_EURO;

		String value1 = (String) Frame.combo.getSelectedItem();
		String value2 = (String) Frame.combo2.getSelectedItem();
		if (value1 == "RON" && value2 == "RON") {
			String suma = Frame.text.getText();
			Frame.text1.setText(suma);

		}
		if (value1 == "EUR" && value2 == "EUR") {
			String suma = Frame.text.getText();
			Frame.text1.setText(suma);

		}
		if (value1 == "USD" && value2 == "USD") {
			String suma = Frame.text.getText();
			Frame.text1.setText(suma);

		}
		if (value1 == "RON" && value2 == "EUR") {
			String suma = Frame.text.getText();
			Double d;
			d = Double.valueOf(suma) / ExchangeRate.LEI_TO_EURO;
			d = Double.parseDouble(String.format("%.4f", d));
			Frame.text1.setText(d.toString());

		}
		if (value1 == "RON" && value2 == "USD") {
			String suma = Frame.text.getText();
			Double d;
			d = Double.valueOf(suma) / ExchangeRate.LEI_TO_USD;
			d = Double.parseDouble(String.format("%.4f", d));
			Frame.text1.setText(d.toString());

		}
		double EUR_TO_USD = ExchangeRate.LEI_TO_EURO / ExchangeRate.LEI_TO_USD;
		if (value1 == "EUR" && value2 == "USD") {
			String suma = Frame.text.getText();
			Double d;
			d = Double.valueOf(suma) * EUR_TO_USD;
			d = Double.parseDouble(String.format("%.4f", d));
			Frame.text1.setText(d.toString());

		}
		if (value1 == "USD" && value2 == "EUR") {
			String suma = Frame.text.getText();
			Double d;
			d = Double.valueOf(suma) * (1.0 / EUR_TO_USD);
			d = Double.parseDouble(String.format("%.4f", d));
			Frame.text1.setText(d.toString());

		}
		if (value1 == "EUR" && value2 == "RON") {
			String suma = Frame.text.getText();
			Double d;
			d = Double.valueOf(suma) * ExchangeRate.LEI_TO_EURO;
			d = Double.parseDouble(String.format("%.4f", d));
			Frame.text1.setText(d.toString());

		}
		if (value1 == "USD" && value2 == "RON") {
			String suma = Frame.text.getText();
			Double d;
			d = Double.valueOf(suma) * ExchangeRate.LEI_TO_USD;
			d = Double.parseDouble(String.format("%.4f", d));
			Frame.text1.setText(d.toString());

		}

	}

}
