import java.awt.*;
import javax.swing.*;

public class TestGridLayout extends JApplet{
  JButton a1,a2,a3,a4,a5,a6;
  GridLayout G;

  public void init(){
    G = new GridLayout(4,4);
    JPanel J = new JPanel();
    
    getContentPane().add(J);
    J.setLayout(G);
  
    a1 = new JButton("OK");
    a2 = new JButton("Cancel");
    a3 = new JButton("Retry");
    a4 = new JButton("Exit");
    a5 = new JButton("Save");
    a6 = new JButton("Exit Without Saving");
  
    J.add(a1);
    J.add(a2);
    J.add(a3);
    J.add(a4);
    J.add(a5);
    J.add(a6);

  }
}
