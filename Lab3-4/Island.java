package pract_interface;

public class Island implements Nameable {
    private int area;
    private String location;
    private String name;

    public Island() {
    }

    public Island(int area, String location, String name) {
        this.area = area;
        this.location = location;
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String getName() {
        return name;
    }
}
