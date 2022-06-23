import java.awt.*;
import javax.swing.*;

public class TestFlowLayout extends JApplet{
   JButton a1, a2, a3;
   FlowLayout F;
   
   public void init(){
     F = new FlowLayout(FlowLayout.CENTER);
     JPanel P = new JPanel();
     getContentPane().add(P);
     P.setLayout(F);
     a1 = new JButton("OK");
     a2 = new JButton("Cancel");
     a3 = new JButton("Retry");
     P.add(a1);
     P.add(a2);
     P.add(a3);
  }
} 
