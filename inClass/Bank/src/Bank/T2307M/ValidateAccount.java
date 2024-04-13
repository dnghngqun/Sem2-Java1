package Bank.T2307M;

public class ValidateAccount {
    //kiểm tra đăng nhập
    public final String MOBILE = "0123456789";
    public final String PASSWORD = "Quan";

    public boolean checkAccount(String mobile, String password){
        if(mobile.equals(MOBILE)){
            if(password.equals(PASSWORD)){
                System.out.println("Login success");
                return true;
            }else {
                System.out.println("Password is incorrect, please try again");
                return false;
            }
        }else {
            System.out.println("Account or Password is incorrect, please try again");
            return false;
        }
    }
}
