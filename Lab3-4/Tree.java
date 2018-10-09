package pract_interface;

public class Tree implements Nameable {
    private int height;
    private int age;
    private String name;

    public Tree() {
    }

    public Tree(int height, int age, String name) {
        this.height = height;
        this.age = age;
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "height=" + height +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
