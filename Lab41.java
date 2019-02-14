public class Lab41 {

    public static String sum(String a, String b) {
        return a + b;
    }

    public static final String A = "Значение глобальной константы метода";

    public static void main(String[] args) {
        final String B = "Значение локальной константы метода";
        String c = "Значение локальной переменной метода";
	    switch (args.length) {
            case 0:
                System.out.println("Моя первая программа");
                break;
            case 1:
                System.out.println(args[0]);
                break;
            case 2:
                try {
                    System.out.println(sum(args[0], args[1]));
                } catch (NumberFormatException e) {
                    System.out.println("Введены не числа");
                }
        }
        System.out.println();
	    System.out.println(A);
        System.out.println(B);
        System.out.println(c);
    }
}
