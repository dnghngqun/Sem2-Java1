import static java.lang.System.out;
/**
 * Xây dựng chương trình hiển thị nhiệt độ của vật và chuyển qua độ F và độ K.
 *
 * @author (Dang Hong Quan)
 * @version (21.0.2)
 */
public class Main {
    public static void main(String[] args) {
        Temperature rectancle = new Temperature();
        rectancle.setcTemp(25);
        out.println("Độ F của vật là: " + rectancle.getFTemp());
        out.println("Độ K của vật là: " + rectancle.getKTemp());
    }
}