package com.example.entity;

public class Employee {
    private String name;
    private int age;
    private int employeeId;

    public Employee(String name, int age, int employeeId) {
        super();
        this.name = name;
        this.age = age;
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public String toString() {
        return "com.example.model.Employee [name=" + name + ", age=" + age + ", employeeId=" + employeeId + "]";
    }
}
