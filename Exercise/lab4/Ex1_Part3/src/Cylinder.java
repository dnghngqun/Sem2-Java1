public class Cylinder extends Circle {
    private double height;

    public double getHeight(){
        return this.height;
    }

    //constructor
    public Cylinder(double radius, String color, double height){
        super(radius, color);
        this.height = height;
    }

    public double getVolume(){
        return getArena() * this.height;
    }

    @Override
    public double getArena(){
        double Sxq = 2 * PI * this.getRadius() * this.height;
        double Sd = PI * this.getRadius() * this.getRadius();
        return Sd + Sxq;
    }
    @Override
    public String toString(){
        return "Hình trụ có bán kính " + this.getRadius() + ", màu " + this.getColor() + ", chiều cao " + this.height
                + ", có diện tích toàn phần bằng " + this.getArena() + ", và có thể tích bằng " + this.getVolume();
    }
}
