public class Circle {
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

    public double getArena(){
        return PI * this.radius * this.radius;
    }

    public String toString(){
        return "Hình tròn bán kính " + this.radius + ", màu " + this.color + ", có diện tích bằng " + this.getArena();
    }
}
