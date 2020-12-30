package com.example.minorProject;

public class Employee {
    private String name;
    private String address;
    private int year;
    private int salary;

    public Employee() {
    }

    public Employee(String name, String address, int year, int salary) {
        this.name = name;
        this.address = address;
        this.year = year;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", year=" + year +
                ", salary=" + salary +
                '}';
    }
}
