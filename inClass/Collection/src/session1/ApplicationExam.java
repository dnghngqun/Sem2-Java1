package session1;

import java.util.ArrayList;
import java.util.Scanner;

public class ApplicationExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student(1, "Ngọc", 18, 8);
        ArrayList<Student> list = new ArrayList<>();

        list.add(student);
        list.add(new Student(2, "Huy", 18, 8));
        list.add(new Student(3, "Hai", 18, 8));
        list.add(new Student(4, "Huong", 18, 8));
        list.add(new Student(5, "Hang", 18, 8));
        list.add(new Student(6, "Hung", 18, 8));
        list.add(new Student(7, "Huy", 18, 8));
        list.add(new Student(8, "Hai", 18, 8));

        for(Student item : list){
            System.out.println(item);
        }

        System.out.print("Tìm kiếm sinh viên: ");
        String nameSrch = scanner.next();
        for(int i = 0 ; i < list.size(); i++){
            if(list.get(i).getName().contains(nameSrch)){
                System.out.println(list.get(i));
                list.remove(i);
            }
        }

        System.out.println("Danh sách sau khi tìm được và xóa: ");
        for(Student item : list){
            System.out.println(item);
        }
    }
}
