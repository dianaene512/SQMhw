import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestSetterVarstaCaine {

    Caine caine;

    @Before
    public void setUp() throws Exception {
        this.caine = new Caine("Caramela",2,"0744444444");
    }

    @After
    public void tearDown() throws Exception {
        caine=null;
    }

    @Test
    public void testRight() {


        try {
            caine.setVarsta(10);
            assertEquals(10, caine.getVarsta());
        } catch (Exception e) {
            fail("trebuie sa fie egale");
        }

    }




}
