
public class AnBisect {

	public static boolean esteAnBisect(int an) {
		if (an % 4 != 0)
			return false;
		if (an % 100 != 0)
			return true;
		if (an % 400 != 0)
			return false;
		return true;

	}

}
