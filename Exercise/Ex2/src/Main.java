import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        FlashLamp lamp = new FlashLamp();
        Battery battery = new Battery();
        //install battery to lamp
        lamp.setBattery(battery);
        //1
        lamp.turnOn();
        lamp.turnOff();
        out.println("-----------------------------");
        //2
        lamp.turnOn();
        lamp.turnOff();
        out.println("-----------------------------");
        //3
        lamp.turnOn();
        lamp.turnOff();
        out.println("-----------------------------");
        //4
        lamp.turnOn();
        lamp.turnOff();
        out.println("-----------------------------");
        //5
        lamp.turnOn();
        lamp.turnOff();
        out.println("-----------------------------");
        //6
        lamp.turnOn();
        lamp.turnOff();
        out.println("-----------------------------");
        //7
        lamp.turnOn();
        lamp.turnOff();
        out.println("-----------------------------");
        //8
        lamp.turnOn();
        lamp.turnOff();
        out.println("-----------------------------");
        //9
        lamp.turnOn();
        lamp.turnOff();
        out.println("-----------------------------");
        //10
        lamp.turnOn();
        lamp.turnOff();
        out.println("Điện năng hiện tại: " + lamp.getBatteryInfo() + "%");
    }
}