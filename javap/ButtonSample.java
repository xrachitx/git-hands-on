import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ButtonSample extends JApplet implements ActionListener{
  JTextField f;
  public void init(){
    Container contentPane = getContentPane();
    contentPane.setLayout(new FlowLayout());

    JButton b = new JButton("Rose");
    b.setActionCommand("Rose");
    b.addActionListener(this);
    contentPane.add(b);

    b = new JButton("Lily");
    b.setActionCommand("Lily");
    b.addActionListener(this);
    contentPane.add(b);

    b = new JButton("Lotus");
    b.setActionCommand("Lotus");
    b.addActionListener(this);
    contentPane.add(b);

    f = new JTextField(20);
    contentPane.add(f);    
  }
  public void actionPerformed(ActionEvent e){
    f.setText(e.getActionCommand());
  }
}
