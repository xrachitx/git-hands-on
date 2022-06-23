import java.awt.*;
import javax.swing.*;

public class TestBorderLayout extends JApplet{
  JButton button1, button2, button3, button4, button5;
  BorderLayout B;
  
  public void init(){
    B = new BorderLayout();

    JPanel p1 = new JPanel();
    getContentPane().add(p1);

    p1.setLayout(B);

    button1 = new JButton("DevOps");
    button2 = new JButton("Terraform");
    button3 = new JButton("Ansible");
    button4 = new JButton("Kubernetes");
    button5 = new JButton("Jenkins");
    
    p1.add("North",button1);
    p1.add("South",button2);
    p1.add("East",button3);
    p1.add("West",button4);
    p1.add("Center",button5);
  }
}
