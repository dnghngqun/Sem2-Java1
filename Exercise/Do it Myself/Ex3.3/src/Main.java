import static java.lang.System.out;
/**
 * Xây dựng chương trình thể hiện sự tương tác giữ hai vật: đèn điện và công tắc.
 *
 * @author (Dang Hong Quan)
 * @version (21.0.2)
 */
public class Main {
    public static void main(String[] agrs){
        SwitchButton switchButton = new SwitchButton();
        ElectricLamp electricLamp = new ElectricLamp();

        switchButton.connectToLamp(electricLamp);//kết nối công tắc với đèn điện

        for(int i = 0; i < 10; i++){
            out.printf("#%d\n",i);
            switchButton.switchOn();
            switchButton.switchOff();
            out.println("-----------------------");
        }
    }
}