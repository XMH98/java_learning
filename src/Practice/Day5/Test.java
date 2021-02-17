package Practice.Day5;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        AePlayWave apw = new AePlayWave("src/Practice/Day5/start.wav");
        apw.start();
        new MyFrame();
    }
}
