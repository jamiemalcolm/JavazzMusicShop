package items;


import behaviour.IPlay;
import behaviour.ISell;

public class Guitar extends Instrument {

    private int numOfStrings;
    private InstrumentType instrumentType;

    public Guitar(String sound, double boughtFor, boolean isAcoustic, int numOfStrings) {
        super(sound, boughtFor, isAcoustic);
        this.numOfStrings = numOfStrings;
        this.instrumentType = InstrumentType.STRINGS;
    }


    public InstrumentType getInstrumentType() {
        return instrumentType;
    }
}
