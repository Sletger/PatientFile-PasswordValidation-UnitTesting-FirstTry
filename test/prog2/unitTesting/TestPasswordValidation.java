package prog2.unitTesting;

import junit.framework.TestCase;

public class TestPasswordValidation extends TestCase {
	 
PasswordValidation pw;	
	/**
	 * TextFixtures um Code immer wieder auf Ursprungs Objekt zurückzusetzen.
	 */
	protected void setUp() throws Exception{
		super.setUp();
		pw = new PasswordValidation();
	}
	
	
	public void testIfPwValidationThrowsExceptionWhenSpaceUsed() {
		try {
			pw.getPwValidation(" 12345678");
			fail();
		} catch (InvalidPasswordException e) {
			assertEquals(e.getClass(), InvalidPasswordException.class);
		}
	}
	
	public void testIfPwValidationThrowsExceptionWhenNoUpperCaseUsed() {
		try {
			pw.getPwValidation("12345678!");
			fail();
		} catch (InvalidPasswordException e) {
			assertEquals(e.getClass(), InvalidPasswordException.class);
		}
	}

	public void testIfPwValidationThrowsExceptionWhenNoSpecialCharacterUsed() {
		try {
			pw.getPwValidation("12345678A");
			fail();
		} catch (InvalidPasswordException e) {
			assertEquals(e.getClass(), InvalidPasswordException.class);
		}
	}
	
	public void testIfPwValidationThrowsExceptionWhenPwTooShort() {
		try {
			pw.getPwValidation("A!test");
			fail();
		} catch (InvalidPasswordException e) {
			assertEquals(e.getClass(), InvalidPasswordException.class);
		}
	}
	
	public void testIfPwValidationThrowsExceptionWhenPwTooLong() {
		try {
			pw.getPwValidation("!ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789");
			fail();
		} catch (InvalidPasswordException e) {
			assertEquals(e.getClass(), InvalidPasswordException.class);
		}
	}
	
	
	public void testIfPwValidationReturnsTrue() {
		assertTrue(pw.getPwValidation("12345678A!"));
	}

}
