package furniture;

public class Chair extends Furniture {
    private int legQuantity;
    private int legHeight;
    private boolean soft;

    public Chair() {
        super();
    }

    public Chair(int legQuantity, int legHeight, boolean soft) {
        super();
        this.legQuantity = legQuantity;
        this.legHeight = legHeight;
        this.soft = soft;
    }

    public Chair(int width, int depth, int height, String[] material, String color, int legQuantity, int legHeight, boolean soft) {
        super(width, depth, height, material, color);
        this.legQuantity = legQuantity;
        this.legHeight = legHeight;
        this.soft = soft;
    }

    public int getLegQuantity() {
        return legQuantity;
    }

    public void setLegQuantity(int legQuantity) {
        this.legQuantity = legQuantity;
    }

    public int getLegHeight() {
        return legHeight;
    }

    public void setLegHeight(int legHeight) {
        this.legHeight = legHeight;
    }

    public boolean isSoft() {
        return soft;
    }

    public void setSoft(boolean soft) {
        this.soft = soft;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "legQuantity=" + legQuantity +
                ", legHeight=" + legHeight +
                ", soft=" + soft +
                "} " + super.toString();
    }
}
