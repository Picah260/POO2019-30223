
public class Test {

	public static void main(String[] args) {
		try {
			int[] array = new int[3];
			System.out.println(array[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(" Exceptia ArrayIndexOutOfBoundsException a fost prinsa");
		}
	}
}
