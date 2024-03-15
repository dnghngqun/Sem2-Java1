public class SavingsAccount {

    int balance;

    public SavingsAccount(int initialBalance){
        balance = initialBalance;
    }
    public void checkBalance(){
        System.out.println("Hello!");
        System.out.println("Your balance is "+ balance);
    }

    public int deposit(int amountToDeposit){
        return balance += amountToDeposit;
    }

    public int withdraw(int amountToWithdraw){
        balance -= amountToWithdraw;
        return amountToWithdraw;
    }

    public static void main(String[] args){
        SavingsAccount savings = new SavingsAccount(2000);

        //Check balance:
        savings.checkBalance();


        //Withdrawing:
        int afterWithdraw =savings.withdraw(300);
        System.out.println("You just withdrew "+afterWithdraw);

        //Check balance:
        savings.checkBalance();

        //Deposit:
        int afterDeposit = savings.deposit(600);
        System.out.println("You just deposited "+afterDeposit);

        //Check balance:
        System.out.println("Hello!");
        System.out.println("Your balance is "+savings.balance);

        //Deposit:
        int afterDeposit2 = savings.balance + 600;
        savings.balance = afterDeposit2;
        System.out.println("You just deposited "+600);

        //Check balance:
        System.out.println("Hello!");
        System.out.println("Your balance is "+savings.balance);

    }
}
