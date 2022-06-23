import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextArea extends JApplet implements ActionListener{
   JTextField f1;
   JTextArea a1;
   JTextArea a2;
 
   Container Panel;
   LayoutManager Layout;

   public TextArea(){
     f1 = new JTextField("Some text",20);
     a1 = new JTextArea(5,20);
     a2 = new JTextArea(5,20);
  
     Layout = new FlowLayout();
     Panel = getContentPane();
     f1.addActionListener(this);
     a1.setEditable(false);
     a1.setBackground(Color.white);
     a1.setLineWrap(true);
     Panel.setLayout(Layout);
     Panel.add(f1);
     Panel.add(a1);
     Panel.add(a2);
     Panel.setBackground(Color.pink);
  }

  public void actionPerformed(ActionEvent e){
     String Reply;
     Reply = "The text that was entered into the JTextField was \"" +
              f1.getText() + "\", and this is the echo with text wrap.";
     a1.setText(Reply);
     Reply = "The Text which was entered\n into the JTextField was \n\"" 
           + f1.getText() + "\",and this was the echo with returns";
     a2.setText(Reply);
  }
}
       
 
