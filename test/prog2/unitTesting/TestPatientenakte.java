package prog2.unitTesting;

import junit.framework.TestCase;

public class TestPatientenakte extends TestCase {
	
	
	Patientenakte p1 = new Patientenakte("Max", "Mustermann", "Musterstadt");
	Patientenakte p2 = new Patientenakte("Hermann", "Müller", "Konstanz");
	Patientenakte p4 = new Patientenakte("J", "M", "K");
	
	

	

	
	
	public void testIfCaseDescriptionIsTooShort() {
		p1.writeCase("");
		assertTrue(p1.caseListe.isEmpty());
	}
	
	public void testIfCaseDescriptionIsTooLong() {
		p1.writeCase("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet. Quisque rutrum. Aenean imperdiet. Etiam ultricies nisi vel augue. Curabitur ullamcorper ultricies nisi. Nam eget dui. Etiam rhoncus. Maecenas tempus, tellus eget condimentum rhoncus, sem quam semper libero, sit amet adipiscing sem neque sed ipsum. Nam quam nunc, blandit vel, luctus pulvinar, hendrerit id, lorem. Maecenas nec odio et ante tincidunt tempus. Donec vitae sapien ut libero venenatis faucibus. Nullam quis ante. Etiam sit amet orci eget eros faucibus tincidunt. Duis leo. Sed fringilla mauris sit amet nibh. Donec sodales sagittis magna. Sed consequat, leo eget bibendum sodales, augue velit cursus nunc, quis gravida magna mi a libero. Fusce vulputate eleifend sapien. Vestibulum purus quam, scelerisque ut, mollis sed, nonummy id, metus. Nullam accumsan lorem in dui. Cras ultricies mi eu turpis hendrerit fringilla. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; In ac dui quis mi consectetuer lacinia. Nam pretium turpis et arcu. Duis arcu tortor, suscipit eget, imperdiet nec, imperdiet iaculis, ipsum. Sed aliquam ultrices mauris. Integer ante arcu, accumsan a, consectetuer eget, posuere ut, mauris. Praesent adipiscing. Phasellus ullamcorper ipsum rutrum nunc. Nunc nonummy metus. Vestibulum volutpat pretium libero. Cras id dui. Aenean ut eros et nisl sagittis vestibulum. Nullam nulla eros, ultricies sit amet, nonummy id, imperdiet feugiat, pede. Sed lectus. Donec mollis hendrerit ri");
		assertTrue(p1.caseListe.isEmpty());
	}
	
	public void testValidPatientInfos() {
		assertEquals("Max", p1.getFirstName());
		assertEquals("Mustermann", p1.getLastName());
		assertEquals("Musterstadt", p1.getAddress());
	}

	public void testInvalidPatientInfo() {
		assertNotSame("Marius", p1.getFirstName());
		assertNotSame("Albeser", p1.getLastName());
		assertNotSame("Konstanz", p1.getAddress());
	}
	
	public void testFirstNameIsBiggerThanOneCharacter() {
		assertTrue(p2.getFirstName() != null);
	}
	
	public void testFirstNameIsSmallerThanOneCharacter() {
		assertTrue(p4.getFirstName() == null);
	}
	
	public void testLastNameIsBiggerThanOneCharacter() {
		assertTrue(p2.getLastName() != null);
	}
	
	public void testLastNameIsSmallerThanOneCharacter() {
		assertTrue(p4.getLastName() == null);
	}
	
	public void testAddressIsBiggerThanOneCharacter() {
		assertTrue(p2.getAddress() != null);
	}
	
	public void testAddressIsSmallerThanOneCharacter() {
		assertTrue(p4.getAddress() == null);
	}
	
	public void testIfMethodShowCasesOnlyShowsFilledCasesLists() {
		p1.writeCase("Test");
		p2.writeCase("");
		p1.showCases();
		p2.showCases();
		assertTrue(p1.filled);
		assertFalse(p2.filled);
	}
	

	
	
	
	
	
	

	
	
}
