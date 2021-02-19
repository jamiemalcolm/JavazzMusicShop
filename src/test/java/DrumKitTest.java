import items.DrumKit;
import items.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumKitTest {

    DrumKit drumKit;


    @Before
    public void before(){
        drumKit = new DrumKit("boom boom ba boom claaang", 300.00, true, 4, 3);
    }



    @Test
    public void hasType() {
        assertEquals(InstrumentType.PERCUSSION, drumKit.getInstrumentType());
    }

    @Test
    public void hasSellFor(){
        assertEquals(150.00, drumKit.calcMarkUp(), 0.01);
    }
}
