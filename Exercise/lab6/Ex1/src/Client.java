import java.util.Scanner;
public class Client {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Triangle triangle[] = new Triangle[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("----------Nhập vào các cạnh tam giác thứ %d------------\n", i + 1);
            System.out.print("Nhập vào cạnh 1: ");
            double a = input.nextDouble();
            System.out.print("Nhập vào cạnh 2: ");
            double b = input.nextDouble();
            System.out.print("Nhập được cạnh 3: ");
            double c = input.nextDouble();
            triangle[i] = new Triangle(a, b, c);
            triangle[i].checked();
            System.out.print("\n");

        }

        if(triangle[4] != null){
            System.out.println("Diện tích tam giác thứ 5: " +triangle[4].getArea());
        }
    }
}