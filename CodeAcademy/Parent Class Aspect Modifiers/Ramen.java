public class Ramen extends Noodle {

    Ramen() {

        super(30.0, 0.3, "flat", "wheat flour");

    }
    // vì đã để từ khoá final ở lớp cha nên không thể ghi đè ở lớp con(override)
    // public boolean isTasty() {

    //   return false;

    // }

}