import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame {
    public static void main(String[] args)
    {
        new MyFrame();
    }
    public MyFrame(){
        Container container = getContentPane();
        container.setLayout(null);
        JButton bl = new JButton("弹出JDialog对话框");
        bl.setBounds(10,10,100,21);
        bl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyJDialog dialog = new MyJDialog(MyFrame.this);
                dialog.setVisible(true);
            }
        });
        container.add(bl);
        setSize(300,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
class MyJDialog extends JDialog{
    public MyJDialog(MyFrame frame)
    {
        super(frame,"JDialog",true);
        Container container = getContentPane();
                container.add(new JLabel("对话框"));
                setBounds(120,100,100,100);
    }

}
