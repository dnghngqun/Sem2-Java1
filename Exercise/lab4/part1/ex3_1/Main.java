package lab4.part1.ex3_1;


public class Main
{
    public static void main(String[] args) {
       SportCar sportCar = new SportCar();
       Car car = new Car();

       car.color = "red";
       //vì sportCar kế thừa từ Car nên có thuộc tính col
       sportCar.color = "Green";

    }
}