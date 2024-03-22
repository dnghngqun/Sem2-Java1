public class Main
{
    public static void main(String[] args) {
        SportCar sportCar = new SportCar();
        Car car = new Car();

        car.color = "red";
        //vì sportCar kế thừa từ Car nên có thuộc tính color
        sportCar.color = "Green";

        Car car1 = new LuxuryCar();
//        car1.service();
        //không thể dùng car1.service vì biến car1 là lớp cha
        //cha có thì con có nhưng con có thì chưa chắc cha có

        //Giải pháp: ép kiểu(type casting)
        ((LuxuryCar)car1).service();
    }
}