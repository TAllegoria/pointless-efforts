package pract_interface;

public class River implements Nameable{
    private int length;
    private String head;
    private String mouth;
    private String name;

    public River() {
    }

    public River(int length, String riverHead, String riverMouth, String name) {
        this.length = length;
        this.head = riverHead;
        this.mouth = riverMouth;
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public String getHead() {
        return head;
    }

    public String getMouth() {
        return mouth;
    }

    @Override
    public String getName() {
        return name;
    }
}
