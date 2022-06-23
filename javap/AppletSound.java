import java.applet.*;

public class AppletSound extends Applet{
  public void init(){
    super.init();
    resize(0,0);
    AudioClip song = getAudioClip(getDocumentBase(),"song.au");
    song.play();
  }
}
