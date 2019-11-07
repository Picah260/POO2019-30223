
public class TestGhiozdan {

	public static void main(String[] args) {
		Ghiozdan g = new Ghiozdan();
		Caiet c = new Caiet("Matematica");
		Manual m = new Manual("Roamana");
		g.addCaiet(c);
		g.addManual(m);
		g.addCaiet(new Caiet("Caligrafie"));
		g.listItemes();
		
		// TODO Auto-generated method stub

	}

}
