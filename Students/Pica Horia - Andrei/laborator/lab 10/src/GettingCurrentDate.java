import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GettingCurrentDate {
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		Date dateobj = new Date();
		Calendar calobj = Calendar.getInstance();
		Frame.labeldate.setText(df.format(calobj.getTime()));
	}
}