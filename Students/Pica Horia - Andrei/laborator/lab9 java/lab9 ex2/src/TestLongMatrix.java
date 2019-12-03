public class TestLongMatrix {
	public static void main(String[] args) {
		Long[][] m1 = new Long[][] { { (long) 100, (long) 2000, (long) 3000 },
				{ (long) 4000, (long) 5500, (long) 6000 }, { (long) 1000, (long) 1000, (long) 1000 } };
		Long[][] m2 = new Long[][] { { (long) 10, (long) 20, (long) 30 }, { (long) 25, (long) 25, (long) 25 },
				{ (long) 0, (long) 0, (long) 0 } };
		LongMatrix longmatrix = new LongMatrix();

		System.out.println("\nm1 + m2 is ");
		GenericMatrix.printResult(m1, m2, longmatrix.addMatrix(m1, m2), '+');

		System.out.println("\nm1 * m2 is ");
		GenericMatrix.printResult(m1, m2, longmatrix.multiplyMatrix(m1, m2), '*');
	}
}