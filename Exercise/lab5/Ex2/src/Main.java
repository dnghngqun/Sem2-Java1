public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(5, 10);
        point.moveDown();
        point.moveDown();
        point.moveLeft();
        point.moveLeft();
        System.out.println("x: "+ point.getX()
                + ", y: " + point.getY());
    }
}