import static java.lang.System.out;

public class SwitchButton {
    private boolean status;
    private ElectricLamp lamp;

    public void connectToLamp(ElectricLamp lamp){
        this.lamp = lamp;
    }
    public void switchOn(){
        out.println("Bật đèn");
        status = true;
        lamp.turnOn();
    }
    public void switchOff(){
        out.println("Tắt đèn");
        status = false;
        lamp.turnOff();
    }
    public void SwitchButton(){
       this.status = false;
    }
}
