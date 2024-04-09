import java.util.InputMismatchException;
import java.util.Scanner;

public class Account {
    private String customerCode;
    private String customerName;
    private int accNumber;
    private long amount = 0;

    static Scanner scanner = new Scanner(System.in);

    //setter
    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }


    //getter
    public String getCustomerCode() {
        return customerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public long getAmount() {
        return amount;
    }

    public void input(){
        System.out.print("\nEnter customer code: ");
        this.customerCode = scanner.next();
        //check customer code
        String[] cusCode = customerCode.split("");
       while (cusCode.length != 5){
           System.out.print("customerCode must be 5 characters. Enter again: ");
           this.customerCode = scanner.next();
           cusCode = customerCode.split("");
       }
        System.out.print("Enter customer name: ");
        this.customerName = scanner.next();

            System.out.print("Enter account number: ");
            this.accNumber = scanner.nextInt();

            //check account number
            String[] accNumberArr = Integer.toString(accNumber).split("");
            while (accNumberArr.length != 6
                    || !accNumberArr[0].equals("1")
                    || !accNumberArr[1].equals("0")
                    || !accNumberArr[2].equals("0")) {
                System.out.print("Account number must be 6 digits and start with '100'. Enter again: ");
                this.accNumber = scanner.nextInt();
                accNumberArr = String.valueOf(accNumber).split("");
            }

    }

    @Override
    public String toString() {
        return "customerCode: " + customerCode +
                ", customerName: " + customerName +
                ", accNumber: " + accNumber +
                ", amount: " + amount;
    }

    public void depositAndWithdraw(long money, int type){
        if (type == 0){
            this.amount += money;
            System.out.println("Amount deposit: " + money);
        }
        if(type == 1){
            if (this.amount >= money && money > 0){
                this.amount -= money;
                System.out.println("Amount withdraw: " + money);
            }else {
                System.err.println("Not enough money");
                System.out.println();
            }
        }

    }
    public static void main(String[] args) throws Exception {

        Account account = new Account();
        System.out.println("Welcome to ATM");
        System.out.println("Enter customer information");
        account.input();
        while (true) {
            System.out.println("The current amount is " + account.getAmount());
            System.out.print("Do you want to deposit or withdraw money? (0: deposit, 1: withdraw): ");
            int type = scanner.nextInt();
            //check type
            while(type != 0 && type != 1){
                System.out.print("Enter again (0: deposit, 1: withdraw): ");
                type = scanner.nextInt();
            }

            System.out.print("Enter the amount: ");
            long money = scanner.nextLong();
            account.depositAndWithdraw(money, type);
            System.out.println("Do you want to continue? (0: yes, 1: no)");
            account.toString();
            int choice = scanner.nextInt();
            while (choice != 0 && choice != 1){
                System.out.println("Enter again (0: yes, 1: no): ");
                choice = scanner.nextInt();
            }
            if (choice == 1) {
                System.out.println("Thanks for using ATM");
                break;
            }
        }
    }
}
