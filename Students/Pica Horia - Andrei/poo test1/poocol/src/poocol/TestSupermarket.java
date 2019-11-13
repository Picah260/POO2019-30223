package poocol;

import java.util.Arrays;

public class TestSupermarket {

	public static void main(String[] args) {
		// Test pentru Angajat
		Angajat[] a = new Angajat[3];
		a[1] = new Angajat(1, "Horia", "22.03.2002", 25);
		a[2] = new Angajat(2, "Oprea", "21.03.2002", 24);
		a[3] = new Angajat(3, "Pica", "20.03.2002", 25);
		Arrays.sort(a);
		for (int i = 1; i <= 3; i++)
			System.out.println(a[i]);
		Produs[] p = new Produs[2];
		p[1] = new Produs("Salam", 250, 25);
		p[2] = new Produs("Paine", 250, 30);
		// Test pt ClientFidel

		ClientFidel f = new ClientFidel(1, "Horia", 152, p, 250, 3650);
		f.calculeazaDiscount(3650);
		ClientFidel[] f1 = new ClientFidel[3];
		f1[1] = new ClientFidel(1, "Horia", 152, p, 25, 30);
		f1[2] = new ClientFidel(2, "Oprea", 160, p, 26, 27);
		f1[3] = new ClientFidel(3, "Pica", 180, p, 28, 29);
		Arrays.sort(f1);
		for (int i = 1; i <= 3; i++)
			System.out.println(f1[i]);

	}
}