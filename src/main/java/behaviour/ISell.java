package behaviour;

import items.InstrumentType;

public interface ISell {

    double calcMarkUp();

    double getBoughtFor();

    double getSellFor();

    InstrumentType getInstrumentType();
}
