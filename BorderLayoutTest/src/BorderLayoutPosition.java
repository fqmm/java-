import java.awt.*;
import javax.swing.*;
public class BorderLayoutPosition extends JFrame{
    public static void main(String[] args){
        new BorderLayoutPosition();
        new BorderLayoutPosition(1);
    }
    public BorderLayoutPosition(){
        setTitle("边界布局管理器");
        Container container = getContentPane();
        setLayout(new BorderLayout());
        JButton cen = new JButton("中");
        JButton nor = new JButton("北");
        JButton sou = new JButton("南");
        JButton wes = new JButton("西");
        JButton eas = new JButton("东");
        container.add(nor,BorderLayout.NORTH);
        container.add(cen,BorderLayout.CENTER);
        container.add(sou,BorderLayout.SOUTH);
        container.add(wes,BorderLayout.WEST);
        container.add(eas,BorderLayout.EAST);
        setSize(350,200);
        setLocation(300,300);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
    public BorderLayoutPosition(int i){
        Container container = getContentPane();
        setLayout(new GridLayout(7,3,5,5));
        for(int b =0;b<=20;b++){
            container.add(new JButton(""+b));
            setSize(300,300);
            setTitle("网格布局管理器");
            setVisible(true);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        }
    }

}
