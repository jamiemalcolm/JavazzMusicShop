package items;

public class Piano extends Instrument{

    private String Style;
    private InstrumentType instrumentType;

    public Piano(String sound, double boughtFor, boolean isAcoustic, String style) {
        super(sound, boughtFor, isAcoustic);
        Style = style;
        this.instrumentType = InstrumentType.KEYS;
    }
}
