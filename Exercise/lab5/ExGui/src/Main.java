public class Main {
    public static void main(String[] args) {

        TaxManager manager = new TaxManager();
        manager.addTaxpayer(new Company());
        manager.addTaxpayer(new Employee());
        manager.addTaxpayer(new FreeLand());
        System.out.println(manager.getTax());
    }
}