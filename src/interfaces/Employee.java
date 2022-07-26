package interfaces;

public class Employee implements Comparable<Employee>{
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
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

    /**
     * Compares employee by salary
     * @param other another Employee object
     * @return a negative value if this employee has a lower salary than
     * otherObject, o if the salaries are the same the same, a positive value otherwise
     */
   @Override
   public int compareTo(Employee other)
   {
       return Double.compare(salary,other.salary);
   }
}
