package prog2.unitTesting;

import java.util.Date;

import junit.framework.TestCase;


public class TestFallbeschreibung extends TestCase {

	Patientenakte p = new Patientenakte();
	Date then;
	
	public void setUp() throws Exception {
		super.setUp();
		then = new Date();
		
	}
	
	public void testIfCaseListIsNotEmpty() {
		p.writeCase("Das ist ein Test");
		assertTrue(!(p.caseListe.isEmpty()));
	}
	
	public void testIfCaseListIsEmpty() {
		p.writeCase("");
		assertTrue(p.caseListe.isEmpty());
	}
	
	public void testIfIndexesAreSortedOldToNewest() {
		p.writeCase("First Case");
		p.writeCase("Second Case");
		assertEquals(p.caseListe.get(0), p.caseListe.get(0));
		assertEquals(p.caseListe.get(1), p.caseListe.get(1));
	}
	
	public void testIfIndexesAreNotMatchingOldToNewest() {
		p.writeCase("First Case");
		p.writeCase("Second Case");
		assertNotSame(p.caseListe.get(0), p.caseListe.get(1));
		assertNotSame(p.caseListe.get(1), p.caseListe.get(0));
	}
	
	public void testIfListItemsHaveDifferenetTimeStamps() {
		p.writeCase("Timestamp");
		assertNotSame(then,p.getTimeStamp());
	}


}
