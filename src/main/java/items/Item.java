package items;

import behaviour.IPlay;
import behaviour.ISell;

public abstract class Item implements ISell {
    private double boughtFor;
    private double sellFor;
    private InstrumentType forType;

    public Item(double boughtFor, InstrumentType forType) {
        this.boughtFor = boughtFor;
        this.sellFor = this.boughtFor * 1.5;
        this.forType = forType;
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

    public InstrumentType getForType() {
        return forType;
    }
}
