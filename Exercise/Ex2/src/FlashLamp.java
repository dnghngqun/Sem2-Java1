import static java.lang.System.err;
import static java.lang.System.out;

public class FlashLamp {

    private boolean status;
    private Battery battery;

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public int getBatteryInfo() {
        return battery.getEnergy();
    }

    public void light(){
        if(status && battery.getEnergy() > 0 && battery != null){
            battery.decreaseEnergy();
        }
    }
    public void turnOff(){
        out.println("Đèn đang tắt. Lượng pin còn lại là: " + battery.getEnergy() + "%");
        status = false;
    }
    public void turnOn(){
        if(battery.getEnergy() > 0 && battery != null){
            status = true;
            out.println("Đèn đang bật. Lượng pin còn lại là: " + battery.getEnergy() + "%");
            light();

        }else{
            err.println("Không đủ điện năng để bật đèn");
        }
    }
    public boolean FlashLamp(){
        return status;
    }

}