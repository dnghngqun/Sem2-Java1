package Bank.T2307M;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ValidateAccount validateAccount = new ValidateAccount();
        Controller controller = new Controller();

        boolean isCheck = false;
        while (!isCheck){
            System.out.print("Enter account number: ");
            String accountNumber = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            isCheck = validateAccount.checkAccount(accountNumber, password);
        }

        while (true){
            menu();
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    long balance = controller.getBalanceNumber();
                    System.out.println("Balance: " + Controller.formatMoney(balance));
                    break;
                case 2:
                    controller.actionTransfer();
                    break;
                case 3:
                    System.out.println("History: ");
                    controller.getHistory();
                    break;
                case 0:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, please try again");
                    break;
            }

        }
    }
    public static void menu(){
        System.out.println("Your choice: ");
        System.out.println("1. View account balance");
        System.out.println("2. Tranfer money");
        System.out.println("3. View transaction history");
        System.out.println("0. Exit");
    }
}
