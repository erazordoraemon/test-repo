package junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PersonneTest {

	Personne p;

	@Before
	public void setUp() throws Exception {
		p = new Personne("COT", "Kevin");
	}

	@Test
	public void testCaracteresAccentues() {
		assertEquals("Sans accents !", "kcot", p.getLogin());
	}

	@Test
	public void testEspaces() {
		assertFalse("Sans espaces !", p.getLogin().contains("-"));
	}

	@Test
	public void testLoginLongueur6() {
		assertTrue("Longueur de 6 !", p.getLogin().length() <= 6);
	}

	@Test
	public void testLoginMinuscules() {
		assertEquals("ALLLOOOOOOOO", "kcot", p.getLogin());
	}

	@Test
	public void testTirets() {
		assertFalse("Sans tirets !", p.getLogin().matches("abc"));
	}
}