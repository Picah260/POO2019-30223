
public class DoubleMatrix extends GenericMatrix<Double> {

	/** Aduna doi intregi */
	protected Double add(Double o1, Double o2) {
		return o1 + o2;
	}

	/** Inmulteste doi intregi */
	protected Double multiply(Double o1, Double o2) {
		return o1 * o2;
	}

	/** Specifica zero pentru un intreg */
	protected Double zero() {
		return (double) 0;
	}
}
