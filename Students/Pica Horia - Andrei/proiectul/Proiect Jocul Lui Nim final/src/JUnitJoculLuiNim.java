
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class JUnitJoculLuiNim {

	Player p = new Player("Pica Horia", false);

	@Test
	void testPlayer() {
		assertTrue(p.getTurn());
	}

	@Test
	void testPlayer2() {
		p.changeTurn();
		assertFalse(p.getTurn());
	}

	@Test
	void testendGame() {
		assertFalse(DissapearActionListener.endGame());

	}

	@Test
	void TestButtons() {
		assertTrue(Graphics.b1.isVisible());
		assertTrue(Graphics.b2.isVisible());
		assertTrue(Graphics.b3.isVisible());
		assertTrue(Graphics.b4.isVisible());
		assertTrue(Graphics.b5.isVisible());
		assertTrue(Graphics.b6.isVisible());
		assertTrue(Graphics.b7.isVisible());
		assertTrue(Graphics.b8.isVisible());
		assertTrue(Graphics.b9.isVisible());
		assertTrue(Graphics.b10.isVisible());
		assertTrue(Graphics.b11.isVisible());
		assertTrue(Graphics.b12.isVisible());
		assertTrue(Graphics.b13.isVisible());
		assertTrue(Graphics.b14.isVisible());
		assertTrue(Graphics.b15.isVisible());
	}

	@Test
	void TestEndGameButtons() {
		Graphics.b1.doClick();
		assertFalse(DissapearActionListener.endGame());
		Graphics.b2.doClick();
		assertFalse(DissapearActionListener.endGame());
		Graphics.b3.doClick();
		assertFalse(DissapearActionListener.endGame());
		Graphics.b4.doClick();
		assertFalse(DissapearActionListener.endGame());
		Graphics.b5.doClick();
		assertFalse(DissapearActionListener.endGame());
		Graphics.b6.doClick();
		assertFalse(DissapearActionListener.endGame());
		Graphics.b7.doClick();
		assertFalse(DissapearActionListener.endGame());
		Graphics.b8.doClick();
		assertFalse(DissapearActionListener.endGame());
		Graphics.b9.doClick();
		assertFalse(DissapearActionListener.endGame());
		Graphics.b10.doClick();
		assertFalse(DissapearActionListener.endGame());
		Graphics.b11.doClick();
		assertFalse(DissapearActionListener.endGame());
		Graphics.b12.doClick();
		assertFalse(DissapearActionListener.endGame());
		Graphics.b13.doClick();
		assertFalse(DissapearActionListener.endGame());
		Graphics.b14.doClick();
		assertFalse(DissapearActionListener.endGame());
		Graphics.b15.doClick();
		assertFalse(DissapearActionListener.endGame());

	}
}
