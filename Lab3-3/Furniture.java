package furniture;

import java.util.Arrays;

public abstract class Furniture {
    private int width;
    private int depth;
    private int height;
    private String material[];
    private String color;

    public Furniture() {
    }

    public Furniture(int width, int depth, int height, String[] material, String color) {
        this.width = width;
        this.depth = depth;
        this.height = height;
        this.material = material;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String[] getMaterial() {
        return material;
    }

    public void setMaterial(String[] material) {
        this.material = material;
    }

    public String toStringMaterial() {
        return Arrays.toString(material);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "width=" + width +
                ", depth=" + depth +
                ", height=" + height +
                ", material=" + Arrays.toString(material) +
                ", color='" + color + '\'' +
                '}';
    }
}
