import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;


public class ImgLoader extends JFrame {
    public static BufferedImage myImage;
    public static Image visibleImage;
    public JFrame jf;
    public JPanel jp = new JPanel();

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(visibleImage, 100, 100, jf);
    }

    ImgLoader(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setSize(800,600);
        jp.setLayout(new BorderLayout());
        jf.add(jp);
        jf.setVisible(true);
    }



    public static void main(String[] args) throws IOException{
        visibleImage = (Image)ImageIO.read(new File(args[0]));
        ImgLoader t = new ImgLoader();
    }
}