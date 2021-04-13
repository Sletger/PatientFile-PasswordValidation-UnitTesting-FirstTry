package prog2.unitTesting;

import junit.framework.TestCase;

public class TestArzt extends TestCase {

	Arzt a1;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		a1 = new Arzt();
	}

	public void testIfMethodOutputIsExceptionWhenPwTooShort() {
		try {
			a1.createAccount("Dr.Oetker", "123");
			fail();
		} catch (InvalidPasswordException e) {
			assertEquals(e.getClass(), InvalidPasswordException.class);
		}
	}
	
	public void testIfMethodOutputIsExceptionWhenPwTooLong() {
		try {
			a1.createAccount("Dr.Oetker", "123456789101111111111111111111111111111!");
			fail();
		} catch (InvalidPasswordException e) {
			assertEquals(e.getClass(), InvalidPasswordException.class);
		}
	}
	
	public void testIfMethodOutputIsExceptionWhenPwHasNoUpperCase() {
		try {
			a1.createAccount("Dr.Oetker", "inkorrektespw!");
			fail();
		} catch (InvalidPasswordException e) {
			assertEquals(e.getClass(), InvalidPasswordException.class);
		}
	}
	
	public void testIfMethodOutputIsExceptionWhenPwHasNoSpecialChar() {
		try {
			a1.createAccount("Dr.Oetker", "InkorrektesPw");
			fail();
		} catch (InvalidPasswordException e) {
			assertEquals(e.getClass(), InvalidPasswordException.class);
		}
	}
	
	public void testIfMethodOutputIsExceptionWhenPwHasSpaces() {
		try {
			a1.createAccount("Dr.Oetker", " InkorrektesPw! ");
			fail();
		} catch (InvalidPasswordException e) {
			assertEquals(e.getClass(), InvalidPasswordException.class);
		}
	}
	public void testCreateAccountWithValidPasswordReturnsTrue() {
		String pw = "ValidesPasswort!";
		a1.createAccount("Dr.Oetker", pw);
		assertTrue(a1.getPwValidation(pw));
	}
}
