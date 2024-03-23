public abstract class Circle {
    private double radius;
    private String color;

    final public double PI = 3.14;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return this.radius;
    }

    public String getColor(){
        return this.color;
    }

    public abstract double getArena();

    public abstract String toString();
}
