import java.net.*;
import java.io.*;

public class ExchangeRate {
	public static double LEI_TO_EURO;
	public static double LEI_TO_USD;
	public static double EURO_TO_USD;
	public static double USD_TO_EURO;

	public ExchangeRate() throws Exception {

		URL oracle = new URL("https://www.cursbnr.ro/");
		URLConnection yc = oracle.openConnection();
		BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
		String inputLine;
		while ((inputLine = in.readLine()) != null)
			if (inputLine.contains("Cursul de astăzi")) {
				String EURO = in.readLine().substring(13, 20);
				String USD = in.readLine().substring(12, 20);

				LEI_TO_EURO = Double.parseDouble(EURO);
				LEI_TO_USD = Double.parseDouble(USD);
				break;
			}
		in.close();
		EURO_TO_USD = LEI_TO_EURO / LEI_TO_USD;
		USD_TO_EURO = 1.0 / EURO_TO_USD;
	}

}