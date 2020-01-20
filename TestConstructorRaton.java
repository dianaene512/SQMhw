import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestConstructorRaton {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRight() {
		float[] greutate = {6,7,9,1};
		try {
			Raton raton = new Raton("Marius",6,greutate,ECuloare.maro);
			assertEquals("Marius",raton.getNume());
			assertEquals(6,raton.getVarsta());
		} catch (VarstaException e) {
			fail("Tre sa ma lase");
		} catch (GreutateNegativaException e) {
			fail("Tre sa ma lase");
		} catch (GrasException e) {
			fail("Tre sa ma lase");
		}
	}

	
	@Test
	public void testExistence() {
		float[] greutate = {6,7,9,1};
		try {
			Raton raton = new Raton("Marius",6,greutate,ECuloare.maro);
			assertNotNull(raton);
		} catch (VarstaException e) {
			fail("Tre sa ma lase");
		} catch (GreutateNegativaException e) {
			fail("Tre sa ma lase");
		} catch (GrasException e) {
			fail("Tre sa ma lase");
		}
	}
	
	@Test
	public void testExceptie1() {
		float[] greutate = {6,7,9,1};
		try {
			Raton raton = new Raton("Marius",4,greutate,ECuloare.maro);
			fail("Trb exceptie varsta");
		} catch (VarstaException e) {
			assertTrue(true);
		} catch (GreutateNegativaException e) {
			fail("Trb exc varsta");
		} catch (GrasException e) {
			fail("Trb exc varsta");
		}
	}
	
	
	
	
	
	
	
}
