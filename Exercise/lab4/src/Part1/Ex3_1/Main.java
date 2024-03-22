package Part1.Ex3_1;

public class Main
{
    public static void main(){
       SportCar sportCar = new SportCar();
       Car car = new Car();

       car.color = "red";
       //vì sportCar kế thừa từ Car nên có thuộc tính col
       sportCar.color = "Green";

    }
}
