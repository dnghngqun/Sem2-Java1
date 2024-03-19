import static java.lang.System.out;
/**
 * Lớp FlashLamp sử dụng lớp Battery để xây dựng chương trình java theo kịch bản.
 *
 * @author (Dang Hong Quan)
 * @version (21.0.2)
 */
public class Battery {
    private int energy;

    public Battery() {
        energy = 100;
    }
    public int getEnergy() {
        return energy;
    }
    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void decreaseEnergy() {
        energy-= 10;
    }
}