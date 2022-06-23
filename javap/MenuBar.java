import java.awt.*;
import javax.swing.*;

public class MenuBar extends JApplet{
  public void init(){
    JMenuBar m = new JMenuBar();
    JMenu fileMenu = new JMenu("Display");
    JMenu pullRightMenu = new JMenu("pull right");
    fileMenu.add("Welcome");
    fileMenu.add(pullRightMenu);
    fileMenu.add("Exit");
    pullRightMenu.add(new JCheckBoxMenuItem("Docker"));
    pullRightMenu.add(new JCheckBoxMenuItem("Ansible"));
    pullRightMenu.add(new JCheckBoxMenuItem("Kubernetes"));
    pullRightMenu.add(new JCheckBoxMenuItem("Terraform"));
    m.add(fileMenu);
    setJMenuBar(m);
  }
}
