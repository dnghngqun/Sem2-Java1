import static java.lang.System.out;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
    public int getHeight() {
        return height;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getPerimeter() {
        return 2 * (width + height);
    }

    public void display(){
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                out.print("#");
            }
            out.print("\n");
        }
    }
    public Rectangle(){
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
    public void main(String[] args) {
    }
}
