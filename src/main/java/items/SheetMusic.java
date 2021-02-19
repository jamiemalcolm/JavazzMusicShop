package items;

public class SheetMusic extends Item{

    private String title;

    public SheetMusic(double boughtFor, InstrumentType forType, String title) {
        super(boughtFor, forType);
        this.title = title;
    }
}
