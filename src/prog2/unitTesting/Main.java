package prog2.unitTesting;

public class Main {

	/**
	 * @author Marius Albeser
	 */
	public static void main(String[] args) {
			
		Patientenakte patient1 = new Patientenakte("Marius", "Albeser", "Konstanz");
		Patientenakte patient2 = new Patientenakte("Max", "Mustermanns", "Konstanz");
		Patientenakte patient3 = new Patientenakte("M", "Muster","München");

		patient1.writeCase("Kraniale Kopfschmerzen.");
		patient1.writeCase("Bandscheibenvorfall.");
		patient1.writeCase("Herzinfarkt.");
		patient1.writeCase("Covid-19 Erkrankung.");
		patient1.writeCase("");
		
		patient1.showCases();
		//patient2.showCases();
		
		//Arzt a1 = new Arzt();
		
		//a1.createAccount("Dr. Korrekt", "Abcdefgh!+;");
		//a1.createAccount("Dr. Inkorrekt", "A Bcdefgh!+;");
		//a1.createAccount("Dr. Inkorrekt", "1234567");
	}
}
