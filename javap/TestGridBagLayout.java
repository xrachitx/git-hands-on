import java.awt.*;
import javax.swing.*;

public class TestGridBagLayout extends JApplet{
   JPanel panelObj;
   GridBagLayout G;
   GridBagConstraints gbCons;
 
   public void init(){
     G = new GridBagLayout();
     JButton b1,b2,b3,b4;

     panelObj = (JPanel)getContentPane();
     panelObj.setLayout(G);

     GridBagConstraints gbCons = new GridBagConstraints();

     b1 = new JButton("Save");
     b2 = new JButton("Exit");
     b3 = new JButton("Close");
     b4 = new JButton("Cancel");
  
     gbCons.fill = GridBagConstraints.BOTH;
     gbCons.anchor = GridBagConstraints.CENTER;
     gbCons.gridwidth = 2;
     gbCons.weightx= 1.0;
  
     panelObj.add(b1,gbCons);

     gbCons.gridwidth = GridBagConstraints.REMAINDER;
     panelObj.add(b2,gbCons);
    
     gbCons.gridwidth = GridBagConstraints.REMAINDER;
     G.setConstraints(b3,gbCons);
     panelObj.add(b3);

     gbCons.fill = GridBagConstraints.BOTH;
     gbCons.anchor = GridBagConstraints.CENTER;
     gbCons.gridwidth = 1;
     gbCons.weightx = 1.0;
     G.setConstraints(b4,gbCons);
     panelObj.add(b4);  
   
   }
}
