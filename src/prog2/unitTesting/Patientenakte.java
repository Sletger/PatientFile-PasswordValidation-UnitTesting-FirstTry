package prog2.unitTesting;

import java.util.Date;



public class Patientenakte extends Fallbeschreibung {

	private String firstName;
	private String lastName;
	private String address;
	private Date timeStamp;
	protected boolean filled;

	public Patientenakte() {

	}

	public Patientenakte(String fN, String lN, String a) {
		if (fN.length() > 1)
			this.firstName = fN;// validating first name to be longer than 1
		if (lN.length() > 1)
			this.lastName = lN;
		if (a.length() > 1)
			this.address = a;
	}

	protected void writeCase(String caseDescription) {
		if (caseDescription.length() >= 1 && (caseDescription).length() <= 2048) // Validating case description length
			this.caseListe.add(caseDescription);
		Date current = new Date();
		timeStamp = current;
	}

	protected void showCases() {
		if (!(this.caseListe.isEmpty())) { // Validating that it only shows caseList if not empty, otherwise String output
			filled = true;
			for (int i = 0; i < this.caseListe.size(); i++) {
				System.out.println(
						this.firstName + " erhielt am " + timeStamp.toString() + " folgende Diagnose: \n" + this.caseListe.get(i));
				} 
			}else {
				filled = false;
				System.out.println("No cases have been added to " + this.firstName + " " + this.lastName + "'s Patientenakte yet!");
			}
		}
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public Date getTimeStamp() {
		return this.timeStamp;
	}

	
}
