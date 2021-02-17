package Practice.Day4;

import java.awt.*;

public class Content implements Runnable {
    private String msg;

    public Content(String msg){
        this.msg = msg;
    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("------>"+msg);
        }
    }
}
