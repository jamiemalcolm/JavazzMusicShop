import items.DrumKit;
import items.DrumSticks;
import items.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTests {

    DrumSticks drumSticks;

    @Before
    public void before(){
        drumSticks = new DrumSticks(7.50, InstrumentType.PERCUSSION, "A6");
    }

    @Test
    public void hasSellFor(){
        assertEquals(11.25, drumSticks.getSellFor(), 0.01);
    }
}
