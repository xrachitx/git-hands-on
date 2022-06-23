import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class JListDemo extends JApplet{
  JList list;
  String[] listColorNames = {"black","blue","pink","gray","white"};
  Color[] listColorValues = {Color.BLACK, Color.BLUE, Color.PINK, Color.GRAY,Color.WHITE};
  Container contentPane;
  public JListDemo(){
    super();
    contentPane = getContentPane();
    contentPane.setLayout(new FlowLayout());
    list = new JList(listColorNames);
    list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    contentPane.add(new JScrollPane(list));
      list.addListSelectionListener(new ListSelectionListener());
   }
   public void valueChanged(ListSelectionEvent e){
       contentPane.setBackground(listColorValues[list.getSelectedIndex()]);
       list. setSize(200, 200);
       list.setVisible(true);
   }

   public static void main(String[ ] args){
     JListDemo test = new JListDemo( );
   }
}
