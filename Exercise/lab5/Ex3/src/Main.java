public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(5, 10, 3, 4);
        point.moveDown();
        point.moveLeft();
        System.out.println(point.toString());
    }
}
