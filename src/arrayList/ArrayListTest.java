package arrayList;

import equals.Employee;

import java.util.ArrayList;

/**
 * This program demonstrates the ArrayList class.
 * @version 1.11 2012-01-26
 * @author Cay Horstmann
 */
public class ArrayListTest {
    public static void main(String[] args) {
        // fill the staff array list with three Employee objects
        ArrayList<Employee> staff = new ArrayList<>();

        staff.add(new Employee("carl Cracker", 75000, 1987, 12, 15));
        staff.add(new Employee("Harry Hacker", 50000, 1989, 10, 1));
        staff.add(new Employee("Tony Tester", 40000, 1990, 3, 15));

        // raise everyone's salary by 5%
        for (Employee e : staff){
            e.raiseSalary(5);
        }

        //print out information about all Employee objects
        for (Employee e : staff){
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay="
            + e.getHireDay());
        }
        System.out.println(max(1,2,3,4,5,6,7,8,9));
    }

    public static int max(int ... a){
        int largest = 0;
        for (int x : a){
            if (x > largest)
                largest = x;
        }
        return largest;
    }
}
