package gradebook;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTest {
	Gradebook gradebook1;
	Gradebook gradebook2;

	@BeforeEach
	void setUp() throws Exception {
		gradebook1 = new Gradebook(4);
		gradebook1.addScore(90);
		gradebook1.addScore(75);
		gradebook1.addScore(85);
		
		gradebook2 = new Gradebook(5);
		gradebook2.addScore(80);
		gradebook2.addScore(85);
		gradebook2.addScore(98);
		gradebook2.addScore(88);
	}

	@AfterEach
	void tearDown() throws Exception {
		gradebook1 = null;
		gradebook2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(gradebook1.toString().equals("90.0 75.0 85.0 "));
		assertTrue(gradebook2.toString().equals("80.0 85.0 98.0 88.0 "));
	
	}

	@Test
	void testSum() {
		assertEquals(250, gradebook1.sum(), .0001); /** .0001 is the delta which sets the maximum amount of decimals 
		allowed for the expected and actual to still be considered equal*/
		assertEquals(351, gradebook2.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(75, gradebook1.minimum(), .001);
		assertEquals(80, gradebook2.minimum(), .001);
	}

	@Test
	void testFinalScore() {
		assertEquals(175, gradebook1.finalScore(), .001);
		assertEquals(271, gradebook2.finalScore(), .001);
	}

	@Test
	void testGetScoreSize() {
		
	}

	@Test
	void testToString() {
		
	}

}
