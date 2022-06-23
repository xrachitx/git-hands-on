import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboBoxExample extends JApplet implements ItemListener{
  JLabel l;
  ImageIcon ROSE,LILY,LOTUS,CARNATION,MARIGOLD;
  
  public void init(){
    Container contentPane = getContentPane();
    contentPane.setLayout(new FlowLayout());
    
    JComboBox c = new JComboBox();
    c.addItem("ROSE");
    c.addItem("LILY");
    c.addItem("LOTUS");
    c.addItem("CARNATION");
    c.addItem("MARIGOLD");
    
    contentPane.add(c);
    l = new JLabel(new ImageIcon("ROSE.jpg"));
    contentPane.add(l);
  }
  public void itemStateChanged(ItemEvent e){
    String s = (String)e.getItem();
    l.setIcon(new ImageIcon(s+".jpg"));
  }
}
