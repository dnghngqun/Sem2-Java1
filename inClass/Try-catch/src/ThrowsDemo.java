import java.io.IOException;
import java.util.Scanner;

public class ThrowsDemo {
    //đây là chương trình không muốn sử dụng try catch
    // để xử lý mà ta sẽ đẩy trách nhiệm cho phương thức khác
   public static int inputAge() throws IOException{
       Scanner scanner = new Scanner(System.in);
       System.out.print("Input your age: ");
       int age = scanner.nextInt();
       if(age <= 0) throw  new IOException("Age must be greater than 0");
       return age;
   }

   public static void getAge(){
       try{
           int age = inputAge();
           System.out.println("Age: " + age);
       }catch (Exception e){
           System.err.println("Age not valid");
//           System.err.println(e.getMessage());
       }
   }
}
