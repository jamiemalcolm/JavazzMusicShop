package items;



public class Guitar {

    private int numOfStrings;
    private boolean isAcoustic;
    private InstrumentType instrumentType;
    private String sound;
    private double boughtFor;
    private double sellFor;

    public Guitar(double boughtFor, int numOfStrings, boolean isAcoustic, String sound){
        this.instrumentType = InstrumentType.STRINGS;
        this.boughtFor = boughtFor;
        this.numOfStrings = numOfStrings;
        this.isAcoustic = isAcoustic;
        this.sound = sound;
        this.sellFor = this.calcMarkUp();


    }

    public InstrumentType getType() {
        return this.instrumentType;
    }

    public String play() {
        return this.sound;
    }

    public double calcMarkUp() {
        return this.boughtFor * 1.5;
    }
}
