package Session2;

public class Cat extends Animal{
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    private int age;



    public Cat(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public void talk(){
        System.out.println("Meo meo ");
    }

    @Override
    public String getAnimalName() {
        return this.getName();
    }
}
