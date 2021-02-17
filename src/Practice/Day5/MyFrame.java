package Practice.Day5;

import javax.swing.*;
import java.io.IOException;

public class MyFrame extends JFrame {
    public MyFrame() throws IOException{
        this.setTitle("捕鱼达人");
        this.setSize(800, 480);
        this.setLocationRelativeTo(null);
        Pool pool = new Pool();
        this.add(pool);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
        pool.start();
    }
}
