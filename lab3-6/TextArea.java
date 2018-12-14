import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TextArea extends JFrame
{
    JTextArea jta1 = new JTextArea();
    JMenuBar menuBar = new JMenuBar();
    JMenu colorMenu = new JMenu("Цвет текста");
    JMenuItem blueMenu = new JMenuItem("Синий");
    JMenuItem redMenu = new JMenuItem("Красный");
    JMenuItem blackMenu = new JMenuItem("Чёрный");
    JMenu fontMenu = new JMenu("Шрифт текста");
    JMenuItem timesMenu = new JMenuItem("Times New Roman");
    JMenuItem sansMenu = new JMenuItem("MS Sans Serif");
    JMenuItem courierMenu = new JMenuItem("Courier New");
    Font timesFont = new Font("Times new roman", Font.PLAIN,14);
    Font sansFont = new Font("MS Sans Serif", Font.PLAIN, 14);
    Font courierFont = new Font("Courier New", Font.PLAIN, 14);
    TextArea() {
        super("Color and font");
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(350,250);
        add(jta1);
        jta1.setSize(350, 230);
        jta1.setLocation(0, 20);
        menuBar.add(colorMenu);
        colorMenu.add(blueMenu);
        blueMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta1.setForeground(Color.blue);
            }
        });
        colorMenu.add(redMenu);
        redMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta1.setForeground(Color.red);
            }
        });
        colorMenu.add(blackMenu);
        blackMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta1.setForeground(Color.black);
            }
        });
        menuBar.add(fontMenu);
        fontMenu.add(timesMenu);
        timesMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta1.setFont(timesFont);
            }
        });
        fontMenu.add(sansMenu);
        sansMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta1.setFont(sansFont);
            }
        });
        fontMenu.add(courierMenu);
        courierMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta1.setFont(courierFont);
            }
        });
        add(menuBar);
        menuBar.setLocation(0,0);
        menuBar.setSize(350, 20);
        setVisible(true);

    }

    public static void main(String[]args)
    {
        new TextArea();
    }
}