package labguide5.StudentManagement;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AppManagement implements mission{
    Scanner scanner = new Scanner(System.in);
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


    public void addStudent(ArrayList<Student> list) throws InputMismatchException {
        System.out.print("Enter roll number students: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter name students: ");
        String name = scanner.next();

        System.out.print("Enter mark student: ");
        float mark = scanner.nextFloat();
        //check mark between 0 and 10
        while (mark < 0 || mark > 10){
            System.out.println("Mark must be between 0 and 10");
            System.out.print("Enter mark student again: ");
            mark = scanner.nextFloat();
        }

        System.out.print("Enter age student: ");
        int age = scanner.nextInt();
        while (age < 0){
            System.out.println("Age must be greater than 0");
            System.out.print("Enter age student again: ");
            age = scanner.nextInt();
        }

        list.add(new Student(id, name, mark, age));
    }

    public void updateStudent(ArrayList<Student> list) throws InputMismatchException {
        System.out.println("Enter name & roll number student to edit information: ");
        System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.print("Enter roll number: ");
        int id = scanner.nextInt();

        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getName() == name && list.get(i).getRollNumber() == id){
                System.out.println("Information found!");
                show(list);
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

    public void deleteStudent(ArrayList<Student>list) throws InputMismatchException {
        System.out.println("Enter name & roll number student to be deleted: ");
        System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.print("Enter roll number: ");
        int id = scanner.nextInt();

        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getName() == name && list.get(i).getRollNumber() == id){
                System.out.println("Information found!");
                list.remove(i);
                System.out.println("Information deleted!");
                break;
            }
        }
        System.out.println("No information found!");
    }

    public void show(ArrayList<Student> list){
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).toString());
        }
    }

    public void run(){
        ArrayList<Student> list = new ArrayList<>();
        while (true) {
            showMenu();
            try{
                System.out.print("\nEnter choice: ");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        try {
                            addStudent(list);
                        }catch (InputMismatchException e){
                            System.err.println("The value entered is incorrect");
                            System.out.println();
                            scanner.nextLine();
                        }
                        finally {
                            break;
                        }
                    case 2:
                        try{
                            updateStudent(list);
                        }catch (InputMismatchException e){
                            System.err.println("The value entered is incorrect");
                            System.out.println();
                            scanner.nextLine();
                        }
                        break;
                    case 3:
                        try{
                            deleteStudent(list);
                        }catch (InputMismatchException e){
                            System.err.println("The value entered is incorrect");
                            System.out.println();
                            scanner.nextLine();
                        }
                        break;
                    case 4:
                        try{
                            Search(list);
                        }catch (InputMismatchException e){
                            System.err.println("The value entered is incorrect");
                            System.out.println();
                            scanner.nextLine();
                        }
                        break;
                    case 5:
                        show(list);
                        break;
                    case 6:
                        try {
                            saveFile(list);
                        }catch (IOException e){
                            System.err.println("An error occurred: " + e.getMessage());
                            System.out.println();
                        }
                        break;
                    case 7:
                        try{
                            loadFile();
                        }catch (IOException e){
                            System.err.println("An error occurred: " + e.getMessage());
                        }
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

            }catch (InputMismatchException e){
                System.err.println("Invalid input! Please enter a valid choice.");
                System.out.println();
            }catch (NumberFormatException e){
                System.err.println("Invalid input! Please enter a valid number.");
                System.out.println();
            }catch (Exception e){
                System.err.println("An error occurred: " + e.getMessage());
                System.out.println();
            }
            System.out.print("Do you want to continue? (Y/N): ");
            char c = scanner.next().charAt(0);
            scanner.nextLine();
            while (true) {
                if (c == 'n' || c == 'N') {
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                } else if (c == 'y' || c == 'Y') {
                    break;
                }else {
                    System.out.println("Invalid choice!");
                    System.out.print("Do you want to continue? (Y/N): ");
                    c = scanner.next().charAt(0);
                    scanner.nextLine();
                }
            }
        }
    }

    public void Search(ArrayList<Student> list) throws InputMismatchException {
        System.out.println("Enter name & roll number of student to find: ");
        System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.print("Enter roll number: ");
        int id = scanner.nextInt();

        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getName() == name && list.get(i).getRollNumber() == id){
                System.out.println("Information found!");
                System.out.println(list.get(i).toString());
            }
        }
    }

    public void saveFile(ArrayList<Student> list) throws IOException {
        BufferedWriter fw = null;
        System.out.print("\nEnter file name: ");
        String nameFile = scanner.next();
        String urlFile =  nameFile + ".txt";
        Writer file = new FileWriter(urlFile);

        fw = new BufferedWriter(file);
        for(Student item : list){
            fw.write(item.getRollNumber() + "," + item.getName() + "," + item.getMark() + "," + item.getAge() + "\n");
        }
        //bắt chương trình chờ ghi dữ liệu xong thì mới kết thúc chương trình.
        fw.flush();
        //tạo đối tượng file để sử dụng phương thức getAbsolutePath()
        File addressFile = new File(urlFile);
        System.out.println("Save to file successfully!");
        System.out.println("Address file: " + addressFile.getAbsolutePath());

        fw.close();
    }

    public void loadFile() throws IOException {
        BufferedReader fr = null;
        System.out.print("\nEnter file name to read: ");
        String nameFile = scanner.next();
        String urlFile = "./" + nameFile + ".txt";
        Reader file = new FileReader(urlFile);
        fr = new BufferedReader(file);
        ArrayList<Student> data = new ArrayList<>();
        String line;
        while((line = fr.readLine()) != null){
            //phân chia dữ liệu bằng dấu ,
            String[] parts = line.trim().split(",");
            int rollNumber = Integer.parseInt(parts[0]);
            String name = parts[1].trim();
            float mark = Float.parseFloat(parts[2]);
            int age = Integer.parseInt(parts[3]);
            data.add(new Student(rollNumber, name, mark, age));
        }
        if(data.isEmpty()){
            System.out.println("File is empty!");
        }
        show(data);
        fr.close();

    }

    public static void main(String[] args) {
        AppManagement app = new AppManagement();
        app.run();
    }
}
