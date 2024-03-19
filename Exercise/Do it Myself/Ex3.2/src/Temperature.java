public class Temperature {
    private double cTemp;

    public void Temperature(double cTemp){
        this.cTemp = cTemp;
    }

    public double getcTemp() {
        return cTemp;
    }

    public void setcTemp(double cTemp) {
        this.cTemp = cTemp;
    }

    public double getFTemp(){
        return (cTemp * 9 / 5) + 32;
    }

    public double getKTemp(){
        return cTemp + 273.15;
    }

    public void Temperature(){
        // //has been written in main
    }
}
