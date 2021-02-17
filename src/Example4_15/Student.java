package Example4_15;

public class Student {
    int number;
    Student(int n){
        number = n;
    }
    void speak(){
        System.out.println("Student类的包名是Example4_15,我的学号："+number);
    }
}
