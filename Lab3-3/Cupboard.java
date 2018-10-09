package furniture;

public class Cupboard extends Furniture {
    private int shelfQuantity;
    private int doorQuantity;
    private boolean doorTransparent;
    private boolean doorMirror;

    public Cupboard() {
        super();
    }

    public Cupboard(int shelfQuantity, int doorQuantity, boolean doorTransparent, boolean doorMirror) {
        super();
        this.shelfQuantity = shelfQuantity;
        this.doorQuantity = doorQuantity;
        this.doorTransparent = doorTransparent;
        this.doorMirror = doorMirror;
    }

    public Cupboard(int width, int depth, int height, String[] material, String color, int shelfQuantity, int doorQuantity, boolean doorTransparent, boolean doorMirror) {
        super(width, depth, height, material, color);
        this.shelfQuantity = shelfQuantity;
        this.doorQuantity = doorQuantity;
        this.doorTransparent = doorTransparent;
        this.doorMirror = doorMirror;
    }

    public int getShelfQuantity() {
        return shelfQuantity;
    }

    public void setShelfQuantity(int shelfQuantity) {
        this.shelfQuantity = shelfQuantity;
    }

    public int getDoorQuantity() {
        return doorQuantity;
    }

    public void setDoorQuantity(int doorQuantity) {
        this.doorQuantity = doorQuantity;
    }

    public boolean isDoorTransparent() {
        return doorTransparent;
    }

    public void setDoorTransparent(boolean doorTransparent) {
        this.doorTransparent = doorTransparent;
    }

    public boolean isDoorMirror() {
        return doorMirror;
    }

    public void setDoorMirror(boolean doorMirror) {
        this.doorMirror = doorMirror;
    }

    @Override
    public String toString() {
        return "Cupboard{" +
                "shelfQuantity=" + shelfQuantity +
                ", doorQuantity=" + doorQuantity +
                ", doorTransparent=" + doorTransparent +
                ", doorMirror=" + doorMirror +
                "} " + super.toString();
    }
}
