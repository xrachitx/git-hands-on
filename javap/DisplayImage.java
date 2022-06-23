import java.awt.*;
import java.applet.*;

public class DisplayImage extends Applet{
  Image i;
  public void init(){
   i = getImage(getDocumentBase(),"training.jpg");
  }

  public void paint(Graphics gra){
    gra.drawImage(i,0,0,this);
  }
}
