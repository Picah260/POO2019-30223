import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		Persoana[] p = new Persoana[3];
		p[0] = new Persoana("Oprescu", "Radu", 3);
		p[1] = new Persoana("Muntean", "Andrei", 5);
		p[2] = new Persoana("Pica", "Horia", 8);
		Arrays.sort(p);
		for (int i = 0; i < 3; i++)
			System.out.println(p[i]);

	}

}
