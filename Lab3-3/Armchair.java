package furniture;

public class Armchair extends Furniture {
    private boolean foldOut;    //раскладывается ли в кровать
    private boolean softArmrests;

    public Armchair() {
        super();
    }

    public Armchair(boolean foldOut, boolean softArmrests) {
        super();
        this.foldOut = foldOut;
        this.softArmrests = softArmrests;
    }

    public Armchair(int width, int depth, int height, String[] material, String color, boolean foldOut, boolean softArmrests) {
        super(width, depth, height, material, color);
        this.foldOut = foldOut;
        this.softArmrests = softArmrests;
    }

    public boolean isFoldOut() {
        return foldOut;
    }

    public void setFoldOut(boolean foldOut) {
        this.foldOut = foldOut;
    }

    public boolean isSoftArmrests() {
        return softArmrests;
    }

    public void setSoftArmrests(boolean softArmrests) {
        this.softArmrests = softArmrests;
    }

    @Override
    public String toString() {
        return "Armchair{" +
                "foldOut=" + foldOut +
                ", softArmrests=" + softArmrests +
                "} " + super.toString();
    }
}
