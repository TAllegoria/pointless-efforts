import javax.swing.*;
import java.awt.*;

class Task_a extends JFrame {
    Task_a() {
        super("Вычисление в одномерном массиве (Задание а)");
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(550, 255);
        //setLocationRelativeTo(null);
        setLocation(super.getWidth() / 4, super.getHeight() / 2 + 100);

        int[] arr = {1, -25, 0, 18, 26, 13};
        int sum = 0;
        String tableString = "Массив: " + (char) 10;
        for (int i = 0; i <= 5; i++) {
            tableString = tableString + arr[i] + (char) 9;
            if (arr[i] > 0) {
                sum += arr[i];
            }
        }
        tableString += (char) 10 + "Сумма положительных элементов массива: " + (char) 10 + sum;

        JTextArea table = new JTextArea();
        table.setEnabled(false);
        table.setDisabledTextColor(Color.black);
        add(table);
        JScrollPane tableScroll = new JScrollPane(table,
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        tableScroll.setBounds(10, 10, 515, 200);
        add(tableScroll);
        table.setText(tableString);

        setVisible(true);
    }

    static class Task_b extends JFrame {
        Task_b() {
            super("Вычисление в одномерном массиве (Задание б)");
            setLayout(null);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setSize(550, 355);
            setLocation(super.getWidth() / 4 + 600, super.getHeight() / 2);

            JTextArea table = new JTextArea();
            table.setEnabled(false);
            table.setDisabledTextColor(Color.black);
            add(table);
            JScrollPane tableScroll = new JScrollPane(table,
                    JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                    JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            tableScroll.setBounds(10, 100, 515, 200);
            add(tableScroll);

            JLabel arrLabel = new JLabel("Исходный массив");
            arrLabel.setBounds(10, 8, 165, 20);
            add(arrLabel);
            JTextField arrText = new JTextField();
            arrText.setBounds(10, 35, 515, 20);
            add(arrText);

            JButton tableBttn = new JButton("Выполнить");
            tableBttn.setBounds(10, 65, 100, 20);
            add(tableBttn);

            setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Task_a();
        new Task_b();
    }
}