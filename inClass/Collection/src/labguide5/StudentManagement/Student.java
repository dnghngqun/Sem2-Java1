package labguide5.StudentManagement;

public class Student {
    private String name;
    private int RollNumber;
    private float Mark;
    private int age;

    public Student (int rollNumber, String name, float mark, int age) {
        this.name = name;
        this.RollNumber = rollNumber;
        this.Mark = mark;
        this.age = age;
    }

    //getters
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return RollNumber;
    }

    public float getMark() {
        return Mark;
    }

    public int getAge() {
        return age;
    }

    //setters

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        RollNumber = rollNumber;
    }

    public void setMark(float mark) {
        Mark = mark;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{ " +
                "RollNumber='" + name + '\'' +
                ", name=" + RollNumber +
                ", Mark=" + Mark +
                ", age=" + age +
                " }";
    }
}

