import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowDemo {
    public static void validate() {
        try{
            //nơi code
            int age = inputAge();
            if(age < 18){
                throw new ArithmeticException("Age must be greater than 18");
            }else {
                System.out.println("Age is invalid");
            }
        }catch (InputMismatchException e){
            System.err.println("Age not valid");
        }
    }
    public static int inputAge(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your age: ");
        int age = scanner.nextInt();
        return age;
    }
}
