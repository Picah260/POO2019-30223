
import java.math.BigDecimal;

public class Matrice {

	public BigDecimal a[][];
	public int n;
	public int m;

	Matrice(int n, int m, BigDecimal[][] a) {
		this.n = n;
		this.m = m;
		this.a = new BigDecimal[n][m];

		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				this.a[i][j] = a[i][j];
	}

	Matrice(int n, int m) {
		this.n = n;
		this.m = m;
		this.a = new BigDecimal[n][m];

		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				this.a[i][j] = new BigDecimal("0");
	}

	public static void afisare(Matrice m1) {
		for (int i = 0; i < m1.n; i++)
			{for (int j = 0; j < m1.m; j++)
				System.out.printf("%s ", m1.a[i][j]);
		System.out.println();}
		System.out.println();

	}

	public static Matrice add(Matrice m1, Matrice m2) {

		Matrice rezultat = new Matrice(m1.n, m1.m);

	
		for (int i = 0; i < m1.n; i++)
			for (int j = 0; j < m1.m; j++) {
				rezultat.a[i][j] = m1.a[i][j].add(m2.a[i][j]);
				
			}
		return rezultat;
	}
	public static Matrice subtract(Matrice m1, Matrice m2) {

		Matrice rezultat = new Matrice(m1.n, m1.m);

		
		for (int i = 0; i < m1.n; i++)
			for (int j = 0; j < m1.m; j++) {
				rezultat.a[i][j] = m1.a[i][j].subtract(m2.a[i][j]);
			}
		return rezultat;
	}

	public static Matrice multiplyScalar(Matrice m1,BigDecimal x) {

		Matrice rezultat = new Matrice(m1.n, m1.m);

		for (int i = 0; i < m1.n; i++)
			for (int j = 0; j < m1.m; j++) {
				rezultat.a[i][j] = m1.a[i][j].multiply(x);
			}
		return rezultat;
	}
	public static BigDecimal determinant (Matrice m1) {

		BigDecimal dp= m1.a[0][0];
		BigDecimal ds= m1.a[0][1];
		
		dp= dp.multiply(m1.a[1][1]);
		ds= ds.multiply(m1.a[1][0]);
		
		return dp.subtract(ds);
	
	}
	public static boolean areEqual(Matrice m1, Matrice m2) {

		for (int i = 0; i < m1.n; i++)
			for (int j = 0; j < m1.m; j++) 
				if (m1.a[i][j].equals(m2.a[i][j])==false) return false;
			
		return true;
	}

	public static boolean isZeroMatrice(Matrice m1) {

		for (int i = 0; i < m1.n; i++)
			for (int j = 0; j < m1.m; j++) 
				if (m1.a[i][j].equals(new BigDecimal("0"))==false) return false;
			
		return true;
	}
	
	public static double fillDegree(Matrice m1) {
		
     double procent =m1.n*m1.m;
     double diferit =0;
		for (int i = 0; i < m1.n; i++)
			for (int j = 0; j < m1.m; j++) 
				if (m1.a[i][j].equals(new BigDecimal("0"))==false) diferit++;
			
		return diferit/procent*100;
	}
	public static void main(String[] args) {

		Matrice m1 = new Matrice(2, 2, new BigDecimal[][] { new BigDecimal[] { new BigDecimal("5"), new BigDecimal("9") },
				new BigDecimal[] { new BigDecimal("7"), new BigDecimal("10") } });

		Matrice m2 = new Matrice(2, 2, new BigDecimal[][] { new BigDecimal[] { new BigDecimal("3"), new BigDecimal("0") },
				new BigDecimal[] { new BigDecimal("0"), new BigDecimal("10") } });
		
		Matrice m3 = new Matrice(2, 2, new BigDecimal[][] { new BigDecimal[] { new BigDecimal("7"), new BigDecimal("2") },
			new BigDecimal[] { new BigDecimal("0"), new BigDecimal("0") } });
		
		Matrice sum = add(m1, m2);
		Matrice minus = subtract(m1, m2);
		Matrice scal = multiplyScalar(m1,new BigDecimal("123"));
		BigDecimal det= determinant(m1);
		
		afisare(sum);
		afisare(scal);
		afisare(minus);
		System.out.println(det);
		System.out.println(areEqual(m1,m2));
		System.out.println(isZeroMatrice(m3));
		System.out.println(fillDegree(m2));

	}

}