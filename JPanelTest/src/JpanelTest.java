import javax.swing.*;
import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
public class JpanelTest extends JFrame {
    public static void main(String[] args)
    {
        JpanelTest test = new JpanelTest();
        test.setVisible(true);
    }
    public JpanelTest(){
        Container container = getContentPane();
        container.setLayout(new GridLayout(2,2,10,10));
        JPanel p1 = new JPanel(new GridLayout(1,4,10,10));
        JPanel p2 = new JPanel(new BorderLayout());
        JPanel p3 = new JPanel(new GridLayout(1,2,10,10));
        JPanel p4 = new JPanel(new GridLayout(2,1,10,10));
        p1.setBorder(BorderFactory.createTitledBorder("面板1"));
        p2.setBorder(BorderFactory.createTitledBorder("面板2"));
        p3.setBorder(BorderFactory.createTitledBorder("面板3"));
        p4.setBorder(BorderFactory.createTitledBorder("面板4"));
        p1.add(new JButton("按钮1"));
        p1.add(new JButton("按钮2"));
        p1.add(new JButton("按钮3"));
        p1.add(new JButton("按钮4"));
        p2.add(new JButton("按钮5"),BorderLayout.WEST);
        p2.add(new JButton("按钮6"),BorderLayout.EAST);
        p2.add(new JButton("按钮7"),BorderLayout.NORTH);
        p2.add(new JButton("按钮8"),BorderLayout.SOUTH);
        p2.add(new JButton("按钮9"),BorderLayout.CENTER);
        p3.add(new JButton("按钮10"));
        p3.add(new JButton("按钮11"));
        p4.add(new JButton("按钮12"));
        p4.add(new JButton("按钮13"));
        container.add(p1);
        container.add(p2);
        container.add(p3);
        container.add(p4);
        setTitle("JPanel面板");
        setLocation(200,100);
        setSize(1500,800);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

}
