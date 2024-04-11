package com.example.model;
import com.example.entity.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class CustomException extends Exception {
    //sử dụng khi định nghĩa các lớp được tuần tự hóa (serialized)
    //chỉ ra một số phiên bản của lớp được tuần tự hóa, giúp xác định phiên bản của lớp khi nó được tuần tự hóa và deserialized.
    private static final long serialVersionUID = 1L;

    public CustomException(String str) {
        super();
        System.out.println(str);
        EmployeeSystem.opeations();
    }
}
public class EmployeeSystem {

    public static Map<Integer, Employee> map = new HashMap<>();

    public static void addEmployee(String name, int age, int id) {
        Employee emp = new Employee(name, age, id);
        map.put(id, emp);

        opeations();
    }

    public static void opeations() {
        System.out.println("\n****** Employee management system *********");
        System.out.println("1. Add Employee");
        System.out.println("2. Delete Employee");
        System.out.println("3. Search Employee");
        System.out.println("4. Employee List");

        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        if(userInput == 1) {
            System.out.println("Enter Employee Details(Name, age, Id)");
            Scanner scanner1 = new Scanner(System.in);

            String name = scanner1.next();
            int age = scanner1.nextInt();
            int id = scanner1.nextInt();

            if(!name.equals("") && age != 0 && id != 0) {
                addEmployee(name, age, id);
            }
        } else if (userInput == 2) {
            System.out.println("Enter Employee Id");
            Scanner scanner2 = new Scanner(System.in);

            int EmpId = scanner2.nextInt();

            try{
                deleteEmployee(EmpId);
            }catch(CustomException e) {
                //e.printStackTrace();
            }
        } else if (userInput == 3) {
            System.out.println("Enter Employee Id");
            Scanner scanner3 = new Scanner(System.in);

            int EmpId = scanner3.nextInt();

            try{
                searchEmployee(EmpId);
            }catch(CustomException e) {
                //e.printStackTrace();
            }

            opeations();
        } else if (userInput == 4) {
            employeeList();

            opeations();

        }

    }

    public static void main(String[] args) {
        opeations();
    }

    public static void employeeList() {
        System.out.println(map.toString());
    }

    public static void deleteEmployee(int EmpId) throws CustomException {
        if(map.containsKey(EmpId)) {
            map.remove(EmpId);
            System.out.println("Successfully Deleted from the List !!");
        } else {
            throw new CustomException("Not Found Exception");
        }
        opeations();
    }

    public static void searchEmployee(int EmpId) throws CustomException {
        if(map.containsKey(EmpId)) {
            System.out.println("Employee Details :- " + map.get(EmpId));
        } else {
            throw new CustomException("Not Found Exception");
        }
        opeations();
    }


}
