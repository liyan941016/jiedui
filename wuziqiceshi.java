package wuziqi;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class FiveChessAppletDemoTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testMain() {
		 Double expectedAnswer = Double.valueOf(12);
		    Double actualAnswer = Double.valueOf(2*6);
		    assertEquals(expectedAnswer, actualAnswer);
	}

}
