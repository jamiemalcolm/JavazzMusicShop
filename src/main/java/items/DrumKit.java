package items;

import behaviour.IPlay;
import behaviour.ISell;

public class DrumKit extends Instrument{
    private int numOfDrums;
    private int numOfSymbols;
    private InstrumentType instrumentType;

    public DrumKit(String sound, double boughtFor, boolean isAcoustic, int numOfDrums, int numOfSymbols) {
        super(sound, boughtFor, isAcoustic);
        this.numOfDrums = numOfDrums;
        this.numOfSymbols = numOfSymbols;
        this.instrumentType = InstrumentType.PERCUSSION;
    }


    public int getNumOfDrums() {
        return numOfDrums;
    }

    public int getNumOfSymbols() {
        return numOfSymbols;
    }

    public String play() {
        return this.getSound();
    }

    public double calcMarkUp() {
        return this.getSellFor();
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }
}
