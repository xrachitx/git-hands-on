import java.awt.*;
import javax.swing.*;

public class TestCardLayout extends JApplet{
  JButton a1,a2,a3;
  CardLayout L;
  JPanel P;

  public void init(){
    P = new JPanel();
    L = new CardLayout();
    P.setLayout(L);
    getContentPane().add(P);
    a1 = new JButton("a");
    a2 = new JButton("b");
    a3 = new JButton("c");

    P.add("a",a1);
    P.add("b",a2);
    P.add("c",a3);
  }
}
