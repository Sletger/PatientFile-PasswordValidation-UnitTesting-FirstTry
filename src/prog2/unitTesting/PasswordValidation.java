package prog2.unitTesting;

public class PasswordValidation {



	/**
	 * Simple counter, to check whether or not User has chosen at least one 'Special
	 * Character'
	 * 
	 * @param pw
	 * @return Counter
	 */
	private int specialCharsCounter(String pw) {
		String specialChars = "!;+";
		int counter = 0;
		char currentChar;
		for (int i = 0; i < pw.length(); i++) {
			currentChar = pw.charAt(i);
			if (specialChars.contains(String.valueOf(currentChar))) {
				counter++;
			}
		}
		return counter;
	}

	/**
	 * Simple counter, to check whether or not User has chosen at least one 'Upper
	 * Case Character'
	 * 
	 * @param pw
	 * @return Counter
	 */
	private int upperCaseCounter(String pw) {
		int counter = 0;
		char currentChar;
		for (int i = 0; i < pw.length(); i++) {
			currentChar = pw.charAt(i);
			if (Character.isUpperCase(currentChar)) {
				counter++;
			}
		}
		return counter;
	}

	/**
	 * Method to check for specific password requirements. Returns and throws
	 * specific Exception if pw requirements are not met
	 * 
	 * @param pw
	 * @return If all pw requirments are met, method returns a true. If not it
	 *         returns false
	 */
	private boolean validate(String pw) {
		char currentChar;
		for (int i = 0; i < pw.length(); i++) {
			currentChar = pw.charAt(i);
			if (pw.length() < 8) {
				throw new InvalidPasswordException(
						"Invalid Password:\nPassword must be atlest 8 Characters and no more than 32 Characters!");
			}
			if (pw.length() > 32) {
				throw new InvalidPasswordException(
						"Invalid Password:\nPassword must be atlest 8 Characters and no more than 32 Characters!");
			}
			if (upperCaseCounter(pw) < 1) {
				throw new InvalidPasswordException(
						"Invalid Password:\nMust contain atleast 1 character in Capital Case!");
			}
			if ((Character.isWhitespace(currentChar))) {
				throw new InvalidPasswordException("Invalid Password:\nMust not contain spaces!");
			}
			if (specialCharsCounter(pw) < 1) {
				throw new InvalidPasswordException(
						"Invalid Password:\nMust contain atleast 1 special Character [!;+]!");
			}
		}
		return true;
	}

	/**
	 * 
	 * @param pw
	 * @return Returns boolean. Method is used by the User-Interface/ Arzt/ Employee
	 *         class, when creating an Account checks for valid Password
	 */
	protected boolean getPwValidation(String pw) {
		return validate(pw);
	}
}
