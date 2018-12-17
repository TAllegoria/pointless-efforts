import java.util.LinkedList;
import java.util.Scanner;

public class LListTest {

    static LinkedList<String> LList = new LinkedList<>();

    public static void main(String Args[]){
        LList.addLast("Элемент с конца");
        LList.addFirst("Элемент с начала");
        LList.addLast("Элемент с конца, которого не будет в последнем выводе");
        LList.addFirst("Ещё один элемент с начала");
        System.out.println(LList.peekLast());
        LList.removeLast();
        LList.addLast("Ещё элемент с конца");
        LList.add("Элемент, добавленный командой add");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку для добавления в начало листа: ");
        LList.addFirst(in.next());
        System.out.println(LList.toString());
    }
}
