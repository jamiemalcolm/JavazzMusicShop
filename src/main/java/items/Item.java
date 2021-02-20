package items;

import behaviour.IPlay;
import behaviour.ISell;

public abstract class Item implements ISell {
    private double boughtFor;
    private double sellFor;
    private InstrumentType instrumentType;

    public Item(double boughtFor, InstrumentType instrumentType) {
        this.boughtFor = boughtFor;
        this.sellFor = this.boughtFor * 1.5;
        this.instrumentType = instrumentType;
    }

    public double calcMarkUp() {
        return this.sellFor - this.boughtFor;
    }

    public double getBoughtFor() {
        return boughtFor;
    }

    public double getSellFor() {
        return sellFor;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

}
