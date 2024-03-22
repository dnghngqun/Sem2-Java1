import static java.lang.System.out;
/**
 * Xây dựng chương trình hiển thị ra hình chữ nhật và tính chu vi diện tích.
 *
 * @author (Dang Hong Quan)
 * @version (21.0.2)
 */

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(7,3);
        rectangle1.display();

        out.println("----------------------");
        out.println("Thay đổi chiều dài thành 15");
        rectangle1.setWidth(15);
        out.println("Thay đổi chiều rộng thành 8");
        rectangle1.setHeight(8);
        out.println("Chu vi hình chữ nhật là: " + rectangle1.getPerimeter());
        out.println("Diện tích hình chữ nhật là: " + rectangle1.getArea());

    }
}
