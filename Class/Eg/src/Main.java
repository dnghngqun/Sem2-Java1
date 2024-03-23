import Session2.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Dog dog = new Dog("Cau vang", 5, 10);
        System.out.println(dog.getAnimalName());

        Cat cat = new Cat("Meo vang", 10);
        System.out.println(cat.getAnimalName());
        cat.talk();
        dog.talk();
    }
}