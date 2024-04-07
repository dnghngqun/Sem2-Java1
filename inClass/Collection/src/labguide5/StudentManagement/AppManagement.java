package labguide5.StudentManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class AppManagement {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Student> list = new ArrayList<>();
    public void showMenu(){
        System.out.print("\n+--------------------------------+");
        System.out.print("\n|      Student Management        |");
        System.out.print("\n+--------------------------------+");
        System.out.print("\n| 1. Add | 2. Update | 3. Delete |");
        System.out.print("\n+--------------------------------+");
        System.out.print("\n| 4. Search | 5. Show  | 6. Save |");
        System.out.print("\n+--------------------------------+");
        System.out.print("\n| 7. Load from File | 8. Exit    |");
        System.out.print("\n+--------------------------------+");
        System.out.print("\n| (C) Java 22                    |");
        System.out.print("\n+--------------------------------+");
    }


    public void addStudent(){
        System.out.print("Enter id students: ");
        int id = scanner.nextInt();
        System.out.print("Enter name students: ");
        String name = scanner.next();
        System.out.print("Enter mark student: ");
        float mark = scanner.nextFloat();
        System.out.print("Enter age student: ");
        int age = scanner.nextInt();

        list.add(new Student(id, name, mark, age));
    }

    public void updateStudent(){
        System.out.print("Enter student name to edit information: ");
        String name = scanner.next();

        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getName().contains(name)){
                System.out.println("Information found!");
                System.out.print("Enter new name: ");
                String newName = scanner.next();
                list.get(i).setName(newName);

                System.out.print("Enter new mark: ");
                float newMark = scanner.nextFloat();
                list.get(i).setMark(newMark);

                System.out.print("Enter new age: ");
                int newAge = scanner.nextInt();
                list.get(i).setAge(newAge);
            }
        }
    }

    public void deleteStudent(){
        System.out.print("Enter the name of the student to be deleted: ");
        String name = scanner.next();

        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getName().contains(name)){
                list.remove(i);
            }
        }
    }

    public void show(){
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).toString());
        }
    }

    public void run(){
        while (true) {
            showMenu();
            System.out.print("\nEnter choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    updateStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    Search();
                    break;
                case 5:
                    show();
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
            System.out.print("Do you want to continue? (Y/N): ");
            char c = scanner.next().charAt(0);
            if (c == 'n' || c == 'N') {
                System.out.println("Goodbye!");
                scanner.close();
                System.exit(0);
            }
        }
    }

    public void Search(){
        System.out.print("Enter name of student to find: ");
        String name = scanner.next();

        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getName().contains(name)){
                System.out.println("Information found!");
                System.out.println(list.get(i).toString());
            }
        }
    }

    public static void main(String[] args) {
        AppManagement app = new AppManagement();
        app.run();
    }
}
