import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.*;

public class ImgLoader {
    public static Image buffer;
    public static void main(String args[]) throws IOException{
        JFrame frame = new JFrame("Image Loader");
        JPanel panel = new JPanel();
        panel.add(new ImageComponent(args[0]));
        frame.setSize(800, 600);
        frame.add(panel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class ImageComponent extends Component {

    BufferedImage img;

    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }

    public ImageComponent(String path) {
        try {
            img = ImageIO.read(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Dimension getPreferredSize() {
        if (img == null) {
            return new Dimension(100, 100);
        } else {
            return new Dimension(img.getWidth(), img.getHeight());
        }
    }
}
