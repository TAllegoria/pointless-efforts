package ball;

public class Basket {

	public static void main(String[] args) {
		Ball b1 = new Ball(15, "rubber", "transparent", false);
		Ball b2 = new Ball(105, "leather", "white", true);
		Ball b3 = new Ball(0, "rubber", "green", true);
		b3.setRadius(56);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.format("Second ball's circumference is %.2f mm \n", b2.getCircumference());
		System.out.format("First ball's volume is %.2f mm^3", b1.getVolume());
	}
}
