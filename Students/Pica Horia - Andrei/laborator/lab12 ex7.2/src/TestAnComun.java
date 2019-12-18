import junit.framework.TestCase;

public class TestAnComun extends TestCase {
	public void testEsteAnComun() {
		assertFalse(AnBisect.esteAnBisect(203));
		assertFalse(!AnBisect.esteAnBisect(4));
		assertFalse(AnBisect.esteAnBisect(99));
		assertFalse(AnBisect.esteAnBisect(100));
		assertFalse(AnBisect.esteAnBisect(200));
		assertFalse(!AnBisect.esteAnBisect(400));
		assertFalse(AnBisect.esteAnBisect(500));
		assertFalse(AnBisect.esteAnBisect(1000));
		assertFalse(!AnBisect.esteAnBisect(1600));
		assertFalse(AnBisect.esteAnBisect(2018));
	}

}
