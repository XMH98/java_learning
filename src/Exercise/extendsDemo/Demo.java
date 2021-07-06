package Exercise.extendsDemo;

/**
 * Author: 徐明皓
 * Date: 2021-07-05 21:04
 * Description: <描述>
 */
public class Demo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.shout();
        cat.shout();

        Animal dog1 = new Dog();
        dog1.shout();

        Animal dog2 = (Animal) dog;
        dog2.shout();

        Animal dog3 = dog;
        dog3.shout();

        dog1 = new Animal();
        dog1.shout();
    }
}
