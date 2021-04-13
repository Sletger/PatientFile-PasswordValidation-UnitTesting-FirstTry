package prog2.unitTesting;

/**
 * Arzt/User/Employee class that is extended by PasswordValidation to validate the password Users pick to creater their KIS Login Account. 
 * 
 *
 */
public class Arzt extends PasswordValidation {
	
	
	/**
	 * Method to create User Account for KIS
	 * @param loginName Not validated yet
	 * @param pw Password that gets entered by User (Arzt) to create Account to log onto KIS
	 */
	protected void createAccount(String loginName, String pw) {
		//no validation for loginName
		if (this.getPwValidation(pw) == true) 
			System.out.println("Success! Password matches requirements!");
	}

}
