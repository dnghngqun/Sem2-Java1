public class SavingsAccount1{

    public String owner;
    public int balanceDollar;
    public double balanceEuro;
    //this là trỏ tới biến được tham chiếu chứ không phải biến cục bộ
    public SavingsAccount(String owner, int balanceDollar){
        // Complete the constructor
        this.owner = owner;
        this.balanceDollar = balanceDollar;
        //tham chiếu tới biến balanceDollar được khai báo ở đầu chứ không phải là biến được truyền vào
        this.balanceEuro = balanceDollar * 0.85;

    }

    public void addMoney(int balanceDollar){
        // Complete this method
        System.out.println("Adding " + balanceDollar + " dollars to the account.");
        this.balanceDollar += balanceDollar;
        System.out.println("The new balance is " + this.balanceDollar + " dollars");

    }

    public static void main(String[] args){
        SavingsAccount zeusSavingsAccount = new SavingsAccount("Zeus", 1000);

        // Make a call to addMoney() to test your method
        zeusSavingsAccount.addMoney(2000);

    }

}