package items;

import behaviour.IPlay;

public class DrumSticks extends Item{
    private String Size;

    public DrumSticks(double boughtFor, InstrumentType instrumentType, String size) {
        super(boughtFor, instrumentType);
        this.Size = size;
    }



}
