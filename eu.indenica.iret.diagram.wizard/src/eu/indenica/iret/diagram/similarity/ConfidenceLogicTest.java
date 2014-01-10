package eu.indenica.iret.diagram.similarity;

import org.apache.log4j.Logger;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConfidenceLogicTest {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger
			.getLogger(ConfidenceLogicTest.class);

	@Test
	public void testGetConfidenceIndexITA() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetConfidenceIndex() {
		ConfidenceLogic cl = new ConfidenceLogic();
		
		if (logger.isInfoEnabled()) {
			logger.info("testGetConfidenceIndex() - "
					+ cl.getConfidenceIndex("News feed", "Feed news"));
		}
		
		assertTrue(true);
	}

	@Test
	public void testRemoveCharAt() {
		fail("Not yet implemented");
	}

	@Test
	public void testSplitCamelCase() {
		String stest= "  Ciao Bello!!  ";
		String sout = ConfidenceLogic.splitCamelCase(stest);
		System.out.println(sout);
		System.out.println(sout.trim());
		System.out.println(sout.trim().split(" ")[0]);
		assertTrue(true);
	}

}
