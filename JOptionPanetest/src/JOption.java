import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
public class JOption {
    public static void main(String[] args){
        Object o[] = {new JButton("是的"),new JButton(("没有"))};
        Icon icon = new ImageIcon("src/注意.png");
        ////////////////////////////////////////////////////////////////////////////////////////
        JOptionPane.showOptionDialog(null,
                "你准备好了吗",
                "注意了",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.DEFAULT_OPTION,
                icon,o,null);
        //////////////////////////////////////////////////////////////////
        int answer = JOptionPane.showConfirmDialog(null,
                "内容",
                "标题",
                JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,icon);
        System.out.println(answer);
        /////////////////////////////////////////////////////////////////////////////
        String name = JOptionPane.showInputDialog(null,"请输入你的姓名","tile");
        ///////////////////////////////////////////////////////////////
        String[] options = {"I adore turtles", "Yes", "Maybe", "Urm...", "No", "Hate them"};
        String n = (String)JOptionPane.showInputDialog(null, "Do you like turtles??",
                "I like turtles", JOptionPane.QUESTION_MESSAGE, icon, options, options[2]);
        System.out.println(n);

        System.out.println(name);
        ///////////////////////////////////////////////////////////////////
        JOptionPane.showMessageDialog(null,
                "内容" ,
                "标题",
        JOptionPane.ERROR_MESSAGE);

    }

}
