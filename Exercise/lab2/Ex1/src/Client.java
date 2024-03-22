import static java.lang.System.out;

/**
 * Lớp Client sử dụng lớp Student để xây dựng chương trình java theo kịch bản.
 *
 * @author (Dang Hong Quan)
 * @version (21.0.2)
 */

public class Client {
    public static void main(String[] args) {
        Students student1 = new Students(1, "Quan", false);
        student1.printInfo();
        Students student2 = new Students(2, "Hoa", true);
        Students student3 = new Students(3, "Hai", false);
        student2.printInfo();
        out.println("Student3 after setting gender and name");
        student3.setMale(true);
        student3.setName("Huy");
        student3.printInfo();

    }
}