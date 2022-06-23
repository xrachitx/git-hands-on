import javax.swing.*;
import java.awt.*;

public class SwingSample extends JApplet{
   public void init(){
     Container contentPane = getContentPane();
     JLabel l = new JLabel("What is Your Name");
     contentPane.add(l);
   }
}
