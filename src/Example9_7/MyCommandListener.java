package Example9_7;

import javax.swing.*;
import java.awt.event.*;

public interface MyCommandListener extends ActionListener {    //子接口多给出了2个方法
    public void setJTextField(JTextField text);
    public void setJTextArea(JTextArea area);
}
