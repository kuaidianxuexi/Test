package demo;

import java.util.Random;

public class Employee {
    private static int nextId;
    private int id;
    private String name;
    private double salary;
    static
    {
        Random generator = new Random();
        nextId = generator.nextInt(10000);
    }
    {
        id = nextId;
        nextId++;
    }
    public Employee(String n, double s){
        name = n;
        salary = s;
    }
    public Employee(double s){
        this("employee#"+nextId,s);
    }
    public Employee(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
