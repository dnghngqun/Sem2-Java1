//VD: demo cho 1 số phương thức trên

import java.util.ArrayList;
import java.util.List;


public class Array_List {
    public static void main(String[] args) {
        //1.khai bao list
        ArrayList<Integer> lst = new ArrayList<>();
        //2.khai bao voi so luong pt ban dau
        ArrayList<Integer> lst2 = new ArrayList<>(5);
        //3.khoi tao voi cac phan tu ban dau
        ArrayList<Integer> lst3 = new ArrayList<>(List.of(1, 3, 5, 9));
        //Xuat list:
        System.out.println(lst);
        System.out.println(lst2);
        System.out.println(lst3);
        //2.Add them phan tu
        ArrayList<Integer> lst4 = new ArrayList<>();
//Add pt
        lst4.add(7);
        lst4.add(8);
        lst4.add(10);
        System.out.println("lst4 moi add la: ");
        System.out.println(lst4);
        //Add(index,element) vao vi tri dc chi dinh
        lst4.add(1, 99);
        System.out.println("lst4 moi add 99 la:");
        System.out.println(lst4);
//2.2 size: Tra ve so phan tu cua list
        System.out.println("so pt cua lst4 la: " + lst4.size());
        //2.3 get(int index) : tra ve gia tri list tai vi tri index
        System.out.println(lst4.get(3));
    }
}