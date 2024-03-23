package Session2;

public class Dog extends Animal{
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    private int height;

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public Dog (String name, int age, int height){
        super(name);//gọi constructor của lớp animal
        //giá trị của field trong lớp cha sẽ được gán
        //sau đó giá trị field trong lớp con mới được gán

        this.age = age;
        this.height = height;
    }
    @Override// thực hiện triển khai phương thức abstract
    public String getAnimalName() {
        return this.getName();

    }

}