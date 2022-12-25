
import java.awt.*;
import javax.swing.*;
public class AbsolutePosition extends JFrame{
    public static void main(String[] args){
        new AbsolutePosition();
        new AbsolutePosition(1);
    }
    public AbsolutePosition(){
        setTitle("绝对布局");
        setLayout(null);
        setBounds(0,0,300,150);
        Container container = getContentPane();
        JLabel jl = new JLabel("内容");
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        JButton b1 = new JButton("按钮1");
        JButton b2 = new JButton("按钮2");
        b1.setBounds(10,30,80,20);
        b2.setBounds(60,70,100,20);
        container.add(b1);
        container.add(b2);
        container.add(jl);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public AbsolutePosition(int i){
        setTitle("流布局管理器");
        Container container = getContentPane();
        setLayout(new FlowLayout(FlowLayout.RIGHT,10,10));
        for(int d =1;d<=10;d++){
            container.add(new JButton(""+d));
        }
        setSize(300,200);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
    }


}
