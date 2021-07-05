package Example.Example4_21;

class Student{
    int number;
}
public class Example4_21 {
    public static void main(String args[]){
        Student stu[] = new Student[10];    //创建对象数组stu
        for(int i=0;i<stu.length;i++){
            stu[i]=new Student();           //创建Student对象stu[i]
            stu[i].number=101+i;
        }
        for(int i=0;i<stu.length;i++){
            System.out.println(stu[i].number);
        }
        /*int stu[] = new int[10];
        for(int i=0;i<stu.length;i++){
            stu[i]=101+i;
        }
        for(int i=0;i<stu.length;i++){
            System.out.println(stu[i]);
        }*/
    }

}
