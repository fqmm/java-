import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JTextFieldText extends JFrame{
    public JTextFieldText()
    {
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        JTextField jt = new JTextField("内容");
        jt.setColumns(20);
        jt.setFont(new Font("宋体",Font.PLAIN,20));
        JButton jb = new JButton("清除");
      //  jt.addActionListener(new ActionListener(){
       //     public void actionPerformed(ActionEvent arg0)
       //     {
               // jt.setText("触发事件");
       //     }

      //  });
        jb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(jt.getText());
                jt.setText("");
                jt.requestFocus();
            }
        });
        container.add(jt);
        container.add(jb);
        setBounds(100,100,250,110);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args)
    {
        new JTextFieldText();
    }
}
