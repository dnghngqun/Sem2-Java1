package Bank.T2307M;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    private static long balanceNumber = 1000000;
    static List<TransactionHistory> listHistory = new ArrayList<>();

    public long getBalanceNumber(){
        return balanceNumber;
    }

    public static long transfer(long money, String benificiaryAccount){
        //kiểm tra nếu số tiền nhỏ hơn 50.000 thì thông báo số tiền chuyển tối thiểu phải là 50.000
        //nếu số tiền chuyển lớn hơn số dư thì thông báo tài khoản không đủ
        //nếu chuyển thành công thì thông báo ck thành công, in ra số dư mới và thêm lịch sử giao dịch mới
        if(balanceNumber < 50000){
            System.out.println("Minimum transfer amount is 50.000");
        } else if (money > balanceNumber) {
            System.out.println("Insufficient account balance");
        }else {
            balanceNumber -= money;
            System.out.println("Transfer successfully");
            System.out.println("Current balance: " + formatMoney(balanceNumber));
            listHistory.add(new TransactionHistory("Transfer", benificiaryAccount , money));
        }

        return balanceNumber;
    }

    public static String formatMoney(long money){
        DecimalFormat formatter = new DecimalFormat("###,###,##0.0");
        //100000 -> 100,000.00
        return formatter.format(money);
    }

    public void actionTransfer(){
        Scanner scanner = new Scanner(System.in);
        //thực hiện các công việc như nhập số tài khoản thụ hưởng, số tiền mô tả tại đây
        System.out.print("Enter benefiary account number: ");
        String beneficiaryAccount = scanner.nextLine();
        System.out.println("Enter money to tranfer: ");
        long money = scanner.nextLong();
        transfer(money, beneficiaryAccount);
    }

    public void getHistory(){
        //In danh sách lịch sử giao dịch
        for(TransactionHistory t : listHistory){
            System.out.println(t.toString());
        }
    }

}
