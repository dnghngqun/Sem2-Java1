import static java.lang.System.out;

public class ElectricLamp {
    private boolean status;

    public ElectricLamp(){
        status = false;
    }
    public void turnOn(){
        status = true;
        out.println("Bật đèn thành công!");
    }
    public void turnOff(){
        status = false;
        out.println("Tắt đèn thành công!");

    }

}
