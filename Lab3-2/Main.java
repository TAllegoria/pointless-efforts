package circles;

public class Main {

    public static void main(String[] args) {
	Circle c1 = new Circle(50, 100, 20, "green");
	Circle c2 = new Circle();
	System.out.println("c2 -- " + c2);
	c2.setColor("yellowish brown");
	c2.setRadius(81);
	c2.move(500, 349);
	c1.setX(120);
	System.out.println("c1 -- " + c1);
	System.out.println("c2 -- " + c2);
    }
}
