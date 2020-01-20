import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestConstructorCaine {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testRight() {

        try {
            Caine caine = new Caine("Grivei",4,"0722222222");
            assertEquals("Grivei",caine.getNume());
            assertEquals(4,caine.getVarsta());
            assertEquals("0722222222",caine.getNr_telefon_proprietar());
        } catch (Exception e) {
            fail("Tre sa ma lase");
        }
    }



}
