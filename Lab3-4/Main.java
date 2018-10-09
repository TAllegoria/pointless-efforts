package pract_interface;

public class Main {

    public static void main(String[] args) {
        Tree t1 = new Tree(23, 68, "Oak");
        River r1 = new River(1779, "Lake Baikal", "Yenisei River", "Angara River");
        Island i1 = new Island(90650, "Arctic Ocean", "Novaya Zemlya");
        System.out.println(t1.getName());
        System.out.println(r1.getName());
        System.out.println(i1.getName());
    }
}
