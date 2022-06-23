import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JLabelDemo extends JApplet{
  private Container Panel;
  private LayoutManager Layout;
  private JLabel Label1;
  private JLabel Label2,Label3,Label4,Label5,Label6,Label7;

  public JLabelDemo(){
    Layout = new GridLayout(7,1);
    Label1 = new JLabel("SAP ASE Performance Tuning");
    Label2 = new JLabel("MySQL DBA Training",JLabel.LEFT);
    Label3 = new JLabel("SQL Server 2019 DBA",JLabel.CENTER);
    Label4 = new JLabel("Oracle DBA",JLabel.RIGHT);
    Label5 = new JLabel("OCI 1072 Certification",JLabel.LEADING);
    Label6 = new JLabel("Jira Training Course",JLabel.TRAILING);
    Label7 = new JLabel();

    Panel = getContentPane();
    Panel.setLayout(Layout);
    
    Panel.add(Label1);
    Panel.add(Label2);
    Panel.add(Label3);
    Panel.add(Label4);
    Panel.add(Label5);
    Panel.add(Label6);
    Panel.add(Label7);

    Panel.setBackground(Color.gray);
    
    Label7.setHorizontalAlignment(JLabel.CENTER);
    Label7.setForeground(Color.blue);
    Label7.setText("IaC with Ansible and Terraform");
  }
}
