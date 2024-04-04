package session1;

import java.util.Scanner;

public class IntegerArrayDemo {
    Scanner scanner = new Scanner(System.in);

    //input element to array
    public void createArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử array tại " + i + " : ");
            arr[i] = scanner.nextInt();
        }
    }
    //output Array
    public void show(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }

        System.out.println();
    }

    //sort asc( tăng dần)
    public void sortAsc(int arr[]){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    //sort desc(giảm dần)
    public void sortDesc(int arr[]){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public int min(int arr[]){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public int max(int arr[]){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
