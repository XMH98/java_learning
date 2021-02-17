package Shu4_7;

public class PC {
    CPU cpu;
    HardDisk HD;
    void setCPU(CPU c){
        cpu = c;
    }
    void setHardDisk(HardDisk h){
        HD = h;
    }
    void show(){
        System.out.println(cpu.speed);
        System.out.println(HD.amount);
    }
}
