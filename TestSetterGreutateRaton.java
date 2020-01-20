import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestSetterGreutateRaton {

	Raton raton;
	
	@Before
	public void setUp() throws Exception {
		float[] greutate = {6,7,9,1};
		this.raton = new Raton("Marius",6,greutate,ECuloare.maro);
	}

	@After
	public void tearDown() throws Exception {
		raton=null;
	}

	@Test
	public void testRight() {

		float[] gr2=new float[3];
		gr2[0]=2.5f;
		gr2[1]=3.0f;
		gr2[2]=4.0f;
		try {
			raton.setGreutate(gr2);
			//assertEquals(gr2,raton.getGreutate());
			assertArrayEquals(gr2, raton.getGreutate(), 0.01f);
		} catch (GreutateNegativaException e) {
			fail("tre sa ma lase");
		}

	}
	
	
	

}
