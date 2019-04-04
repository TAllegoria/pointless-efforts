import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import static java.lang.Math.*;

public class RPP_lab43 extends JFrame {

    public double Formula(double a, double b, double c, double x) {
        return pow(E, sqrt(cos(b * x) + x)) * sin(sqrt(a * x + 1) / c);
    }

    NumberFormat formatter = new DecimalFormat("#0.00");

    RPP_lab43() {
        super("Вычисление значения функции");
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(450, 550);
        setLocationRelativeTo(null);

        //задание а)

        JLabel aLabel = new JLabel("a");
        aLabel.setBounds(10, 5, 25, 20);
        add(aLabel);
        JTextField aText = new JTextField();
        aText.setBounds(23, 7, 100, 20);
        add(aText);

        JLabel bLabel = new JLabel("b");
        bLabel.setBounds(10, 35, 25, 20);
        add(bLabel);
        JTextField bText = new JTextField();
        bText.setBounds(23, 37, 100, 20);
        add(bText);

        JLabel cLabel = new JLabel("c");
        cLabel.setBounds(10, 65, 25, 20);
        add(cLabel);
        JTextField cText = new JTextField();
        cText.setBounds(23, 67, 100, 20);
        add(cText);

        JLabel xLabel = new JLabel("x");
        xLabel.setBounds(10, 95, 25, 20);
        add(xLabel);
        JTextField xText = new JTextField();
        xText.setBounds(23, 97, 100, 20);
        add(xText);

        JLabel yLabel = new JLabel("y = ");
        yLabel.setBounds(10, 168, 25, 20);
        add(yLabel);
        JLabel yText = new JLabel(" ");
        yText.setBounds(30, 169, 93, 20);
        yText.setOpaque(true);
        yText.setBackground(Color.WHITE);
        add(yText);

        JButton clclt = new JButton("Вычислить");
        clclt.setBounds(22, 127, 100, 20);
        add(clclt);
        clclt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                try {
                    yText.setText(String.valueOf(formatter.format(Formula(Double.parseDouble(aText.getText()), Double.parseDouble(bText.getText()), Double.parseDouble(cText.getText()), Double.parseDouble(xText.getText())))));
                } catch (Exception e) {
                    JOptionPane error = new JOptionPane();
                    error.showMessageDialog(RPP_lab43.super.rootPane, "Некорректные данные, введите правильно значения переменных!" );
                    yText.setText(" ");
                }
            }
        });

        //задание б)

        JLabel xStartLabel = new JLabel("x начальное");
        xStartLabel.setBounds(10, 205, 80, 20);
        add(xStartLabel);
        JTextField xStartText = new JTextField();
        xStartText.setBounds(10, 227, 75, 20);
        add(xStartText);

        JLabel xEndLabel = new JLabel("x конечное");
        xEndLabel.setBounds(105, 205, 80, 20);
        add(xEndLabel);
        JTextField xEndText = new JTextField();
        xEndText.setBounds(105, 227, 75, 20);
        add(xEndText);

        JLabel stepLabel = new JLabel("шаг");
        stepLabel.setBounds(200, 205, 80, 20);
        add(stepLabel);
        JTextField stepText = new JTextField();
        stepText.setBounds(200, 227, 75, 20);
        add(stepText);

        JButton tableBttn = new JButton("Вывести таблицу значений");
        tableBttn.setBounds(10, 260, 415, 30);
        add(tableBttn);

        JTextArea table = new JTextArea();
        table.setEnabled(false);
        table.setDisabledTextColor(Color.black);
        add(table);
        JScrollPane tableScroll = new JScrollPane(table,
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        tableScroll.setBounds(10, 300, 415, 200);
        add(tableScroll);

        tableBttn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent aT) {
                String tableString;
                try {
                    tableString = "a" + (char)9 + "b" + (char)9 + "c" + (char)9 + "x" + (char)9 + "y" + (char)10; //(char)9 -- табуляция, (char)10 -- перевод строки
                    for (double x = Double.parseDouble(xStartText.getText()); x <= Double.parseDouble(xEndText.getText()); x += Double.parseDouble(stepText.getText())) {
                        tableString += aText.getText() + (char)9 + bText.getText() + (char)9 + cText.getText() + (char)9 + x + (char)9
                                + String.valueOf(formatter.format(Formula(Double.parseDouble(aText.getText()), Double.parseDouble(bText.getText()), Double.parseDouble(cText.getText()), x))) + (char)10;
                    }
                    table.setText(tableString);
                } catch (Exception eT) {
                    JOptionPane error = new JOptionPane();
                    error.showMessageDialog(RPP_lab43.super.rootPane, "Некорректные данные, введите правильно значения переменных!" );
                    table.setText(" ");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new RPP_lab43();
    }
}
