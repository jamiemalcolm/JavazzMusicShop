package items;

public class Trumpet extends Instrument{

    private int numberOfValves;
    private InstrumentType instrumentType;


    public Trumpet(String sound, double boughtFor, boolean isAcoustic, int numberOfValves) {
        super(sound, boughtFor, isAcoustic);
        this.numberOfValves = numberOfValves;
        this.instrumentType = InstrumentType.KEYS;
    }
}
