
import java.awt.*;  
public class AWTDemo
{  
  AWTDemo()
  {  
    Frame choice_f= new Frame();  
    Choice obj=new Choice();  
    obj.setBounds(80,80, 100,100);  
    obj.add("Red");  
    obj.add("Blue");  
    obj.add("Black");  
    obj.add("Pink");  
    obj.add("White");  
    obj.add("Green");
    choice_f.add(obj);  
    choice_f.setSize(400,400);  
    choice_f.setLayout(null);  
    choice_f.setVisible(true);  
  }  
  public static void main(String args[])  
  {  
    new AWTDemo();  
  }  
}
