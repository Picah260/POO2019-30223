
public class LongMatrix extends GenericMatrix<Long> {

	/** Aduna doi intregi */
	protected Long add(Long o1, Long o2) {
		return o1 + o2;
	}

	/** Inmulteste doi intregi */
	protected Long multiply(Long o1, Long o2) {
		return o1 * o2;
	}

	/** Specifica zero pentru un intreg */
	protected Long zero() {
		return (long)0;
	}
}
