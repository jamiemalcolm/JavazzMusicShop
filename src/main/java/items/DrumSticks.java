package items;

import behaviour.IPlay;

public class DrumSticks extends Item{
    private String Size;

    public DrumSticks(double boughtFor, InstrumentType forType, String size) {
        super(boughtFor, forType);
        this.Size = size;
    }
}
