import java.awt.Image;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Suweizhe {

	 public static void main(String[] args) throws Exception {
		    URL url16 = new URL("https://github.com/SuWeizhe1124/-image/blob/main/%E6%9C%83%E5%93%A1%E5%8A%A0%E5%85%A5/1.jpg?raw=true");
		    URL url32 = new URL("https://github.com/SuWeizhe1124/-image/blob/main/%E6%9C%83%E5%93%A1%E5%8A%A0%E5%85%A5/1.jpg?raw=true");

		    final List<Image> icons = new ArrayList<Image>();
		    icons.add(ImageIO.read(url16));
		    icons.add(ImageIO.read(url32));

		    JFrame f = new JFrame();
		    f.setIconImages(icons); 
		    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                       // 寬 長
		    f.setSize(500, 500);
		    f.setVisible(true);
		  }
}
