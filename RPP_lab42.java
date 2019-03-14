import java.util.Scanner;

import static java.lang.Math.*;
//Вариант 2
public class RPP_lab42 {

    public static void main(String[] args) {
        final double A = 2.13;
        final double B = 4.7;
        final double C = 2.6;
        final double X = 1.2;
        double y = pow(E, sqrt(cos(B * X) + X)) * sin(sqrt(A * X + 1) / C);
        System.out.print("Результат вычисления на константах (A = " + A + ", B = " + B + ", C = " + C + ", X = " + X + "): ");
        System.out.format("%.4f%n", y);

        if (args.length == 4) {
            double argA = 0.0;
            double argB = 0.0;
            double argC = 0.0;
            double argX = 0.0;
            try {
                argA = Double.parseDouble(args[0]);
                argB = Double.parseDouble(args[1]);
                argC = Double.parseDouble(args[2]);
                argX = Double.parseDouble(args[3]);
            } catch (Exception e) {
                System.out.println("Ошибка ввода в аргументах командной строки, вычисление не проведено");
                y = -2.0;
            }
            if (y != -2.0) {
                y = pow(E, sqrt(cos(argB * argX) + argX)) * sin(sqrt(argA * argX + 1) / argC);
                System.out.print("Результат вычисления на аргументах (A = " + argA + ", B = " + argB + ", C = " + argC + ", X = " + argX + "): ");
                System.out.format("%.4f%n", y);
            }
        } else {
            System.out.println("Аргумента командной строки не четыре, вычисление не проведено");
        }

        y = 0.0;
        Scanner in = new Scanner(System.in);
        System.out.println("Ввести данные (A, B, C, X): ");
        double inA = 0.0;
        double inB = 0.0;
        double inC = 0.0;
        double inX = 0.0;
        try {
            inA = in.nextDouble();
            inB = in.nextDouble();
            inC = in.nextDouble();
            inX = in.nextDouble();
        } catch (Exception e) {
            System.out.println("Ошибка ввода, вычисление не проведено");
            y = -2.0;
        }
        if (y != -2.0) {
            y = pow(E, sqrt(cos(inB * inX) + inX)) * sin(sqrt(inA * inX + 1) / inC);
            System.out.println("Результат вычисления на введённых данных (A = " + inA + ", B = " + inB + ", C = " + inC + ", X = " + inX + "): ");
            System.out.format("%.3f%n", y);
        }
    }
}