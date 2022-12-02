package src;

import java.awt.*;
import javax.swing.*;
public  class JFreamTest{
    public static void main(String[] args)
    {
        JFrame jf = new JFrame();
        jf.setTitle("JFrame窗体");
        Container container = jf.getContentPane();
        JLabel jl = new JLabel("窗体");
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(jl);
        jf.setSize(400,200);
        jf.setLocation(750, 450);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
}
