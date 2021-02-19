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
        guitar = new Guitar("Strum de dum",125.00, true, 6 );
        guitar2 = new Guitar("waaa whaaaa waaa",225.00, false, 6);
        guitar3 = new Guitar("dum dum doom dum doom", 175.00, false, 4);
    }

    @Test
    public void guitarHasSellFor(){
        assertEquals(187.50, guitar.calcMarkUp(), 0.01);
    }

    @Test
    public void guitarCanPlay(){
        assertEquals("Strum de dum", guitar.play());
    }

    @Test
    public void hasSellFor(){
        assertEquals(187.50, guitar.getSellFor(), 0.01);
    }
}
