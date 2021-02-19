package items;

import behaviour.IPlay;
import behaviour.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String sound;
    private double boughtFor;
    private double sellFor;
    private boolean isAcoustic;

    public Instrument(String sound, double boughtFor, boolean isAcoustic) {
        this.sound = sound;
        this.boughtFor = boughtFor;
        this.sellFor = boughtFor * 1.5;
        this.isAcoustic = isAcoustic;
    }

    public String getSound() {
        return sound;
    }

    public double getBoughtFor() {
        return boughtFor;
    }

    public double getSellFor() {
        return sellFor;
    }

    public boolean isAcoustic() {
        return isAcoustic;
    }
}
