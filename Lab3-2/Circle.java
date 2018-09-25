package circles;

public class Circle {
    public int x;
    public int y;
    public int radius;
    public String color;

    public Circle() {
        this.x = 0;
        this.y = 0;
        this.radius = 0;
        this.color = "transparent";
    }

    public Circle(int x, int y, int radius, String color) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "x = " + this.x + "; y = " + this.y + "; radius = "
                + this.radius + "; color is " + this.color;
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }
}
