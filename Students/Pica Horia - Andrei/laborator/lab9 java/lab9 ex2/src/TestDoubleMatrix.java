public class TestDoubleMatrix {
	public static void main(String[] args) {
		Double[][] m1 = new Double[][] { { 1.0, 2.0, 3.0 }, { 4.0, 5.5, 6.0 }, { 1.0, 1.0, 1.0 } };
		Double[][] m2 = new Double[][] { { 1.0, 1.0, 1.5 }, { 2.5, 2.5, 2.5 }, { 0.2, 0.5, 0.5 } };
		DoubleMatrix doubleMatrix = new DoubleMatrix();

		System.out.println("\nm1 + m2 is ");
		GenericMatrix.printResult(m1, m2, doubleMatrix.addMatrix(m1, m2), '+');

		System.out.println("\nm1 * m2 is ");
		GenericMatrix.printResult(m1, m2, doubleMatrix.multiplyMatrix(m1, m2), '*');
	}
}