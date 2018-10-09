package furniture;

public class FurnitureShop {

    public static void main(String[] args) {
	Chair ch1 = new Chair(4, 50, false);
	Cupboard cb1 = new Cupboard(220, 90, 200, new String[]{"wood", "glass"}, "white", 8, 3, true, false);
	Armchair ach1 = new Armchair(130, 130, 150, new String[]{"wood", "cloth"}, "red", false, true);
    ch1.setWidth(40);
    ch1.setDepth(45);
    ch1.setHeight(100);
    ch1.setMaterial(new String[]{"wood", "metal"});
    ch1.setColor("not painted");
    System.out.println(ach1.toStringMaterial());
    System.out.println(ch1.toString());
    System.out.println(cb1.toString());
    System.out.println(ach1.toString());
    }
}
