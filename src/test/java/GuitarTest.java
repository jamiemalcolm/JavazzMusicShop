import items.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;
    Guitar guitar2;
    Guitar guitar3;

    @Before
    public void before(){
        guitar = new Guitar(125.00, 6, true, "Strum de dum");
        guitar2 = new Guitar(225.00, 6, false, "waaa whaaaa waaa");
        guitar3 = new Guitar(175.00, 4, false, "dum dum doom dum doom");
    }

    @Test
    public void guitarHasSellFor(){
        assertEquals(187.50, guitar.calcMarkUp(), 0.01);
    }
}
