import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import static java.lang.Math.*;

//todo ПРОВЕРКА НА ДУРАКА И ЗАДАНИЕ б)

public class RPP_lab43 extends JFrame {

    public double Formula(double a, double b, double c, double x) {
        return pow(E, sqrt(cos(b * x) + x)) * sin(sqrt(a * x + 1) / c);
    }

    NumberFormat formatter = new DecimalFormat("#0.00");

    RPP_lab43() {
        super("Вычисление значения функции");
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(350, 250);

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
        yLabel.setBounds(10, 167, 25, 20);
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
            public void actionPerformed(ActionEvent e) {
                yText.setText(String.valueOf(formatter.format(Formula(Double.parseDouble(aText.getText()), Double.parseDouble(bText.getText()),  Double.parseDouble(cText.getText()), Double.parseDouble(xText.getText())))));
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new RPP_lab43();
    }
}
