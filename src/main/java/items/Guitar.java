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

    @Override
    public double getSellFor() {
        return super.getSellFor();
    }

    public String play() {
        return this.getSound();
    }

    public double calcMarkUp() {
        return getBoughtFor() * 1.5;
    }
}
