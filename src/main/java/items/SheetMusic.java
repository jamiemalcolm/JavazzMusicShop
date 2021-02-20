package items;

public class SheetMusic extends Item{

    private String title;

    public SheetMusic(double boughtFor, InstrumentType instrumentType, String title) {
        super(boughtFor, instrumentType);
        this.title = title;
    }
}
