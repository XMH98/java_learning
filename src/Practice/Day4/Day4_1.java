package Practice.Day4;
//划线
import javax.swing.*;

public class Day4_1 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JPanel pan = new MyPanel();
        f.add(pan);
        f.setSize(400, 400);
        f.setLocationRelativeTo(null);
        f.setTitle("案例");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setResizable(false);
    }
}
