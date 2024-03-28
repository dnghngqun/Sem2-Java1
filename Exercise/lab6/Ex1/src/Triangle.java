public class Triangle {
    private double edge1;
    private double edge2;
    private double edge3;


    public void setEdge1(double edge1) {
        this.edge1 = edge1;
    }

    public void setEdge2(double edge2) {
        this.edge2 = edge2;
    }

    public void setEdge3(double edge3) {
        this.edge3 = edge3;
    }

    //    constructor
    public Triangle(double edge1, double edge2, double edge3) {
      this.edge1 = edge1;
      this.edge2 = edge2;
      this.edge3 = edge3;
    }

    public double getEdge1() {
        return this.edge1;
    }

    public double getEdge2() {
        return this.edge2;
    }

    public double getEdge3() {
        return this.edge3;
    }



    public double getArea() {
      double p = (edge1 + edge2 + edge3) / 2;
      return Math.sqrt((p * (p - edge1) * (p - edge2) * (p - edge3)));
    }

    public void checked(){
        if(edge1 + edge2 <= edge3 || edge1 + edge3 <= edge2 || edge2 + edge3 <= edge1){
           InvalidTriangleException InvalidTriangleException = new InvalidTriangleException("Giá trị các cạnh không chính xác!");
            try {
                InvalidTriangleException.throwException();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }else{
            System.out.println("Tam giác hợp lệ!");
        }
    }



}
