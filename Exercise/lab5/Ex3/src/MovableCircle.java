public class MovableCircle implements Movable {
    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }

    private int radius;
    private MovablePoint center;

    public int getRadius() {
        return radius;
    }

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public String toString(){
        return String.format("Circle[radius = %d, x = %d, y = %d, xSpeed = %d, ySpeed = %d]", radius, center.getX(), center.getY(), center.getxSpeed(), center.getySpeed());
    }
}
