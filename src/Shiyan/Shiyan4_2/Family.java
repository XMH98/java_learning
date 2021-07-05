package Shiyan.Shiyan4_2;

public class Family {
    TV homeTV;
    void buyTV(TV tv){
        homeTV = new TV();
    }
    void remoteControl(int m){
        homeTV.setChannel(m);
    }
    void seeTV(){
        homeTV.showProgram();
    }
}
