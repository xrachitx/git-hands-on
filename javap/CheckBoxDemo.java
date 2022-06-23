import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CheckBoxDemo extends JApplet implements ActionListener{
  JTextField f;

  public void init(){
    Container contentPane = getContentPane();
    contentPane.setLayout(new FlowLayout());

    JCheckBox c = new JCheckBox("Movies");
    c.setActionCommand("Movies");
    c.addActionListener(this);
    contentPane.add(c);

    c = new JCheckBox("Sports");
    c.setActionCommand("Sports");
    c.addActionListener(this);
    contentPane.add(c);

    c = new JCheckBox("Politics");
    c.setActionCommand("Politics");
    c.addActionListener(this);
    contentPane.add(c);
 
    f = new JTextField(20);
    contentPane.add(f);
  }
  
  public void actionPerformed(ActionEvent e){
    f.setText(e.getActionCommand());
  }
}
