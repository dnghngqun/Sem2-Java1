package session1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntegerArrayDemo integerArrayDemo = new IntegerArrayDemo();
        System.out.print("How many elements of array: ");
        int size = scanner.nextInt();
        int intArr[] = new int[size];
        integerArrayDemo.createArray(intArr);
        integerArrayDemo.show(intArr);
        System.out.println();

        System.out.println("Length off Array: "+ intArr.length);
//        System.out.println("Value of index 3: " + intArr[3]);
        System.out.println("Sau khi sắp xếp:");
        integerArrayDemo.sortAsc(intArr);
        integerArrayDemo.show(intArr);
        System.out.println("--------------------------------------");
        integerArrayDemo.sortDesc(intArr);
        integerArrayDemo.show(intArr);

        System.out.println("Max: "+ integerArrayDemo.max(intArr));
        System.out.println("Min: "+ integerArrayDemo.min(intArr));
        stringArrDemo();
    }
    static void stringArrDemo(){
        String stringArr[] = new String[5];
        stringArr[0] = "Hello";
        stringArr[1] = "To";
        stringArr[2] = "My";
        stringArr[3] = "Array";
        stringArr[4] = "Demo";

        for (int i = 0; i< stringArr.length; i++){
            System.out.printf("String array %d: %s\n", i, stringArr[i]);
        }
    }
}
