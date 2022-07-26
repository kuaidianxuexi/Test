package objectAnalyzer;

import demo.Employee;

import java.util.ArrayList;

public class ObjectAnalyzerTest {
    public static void main(String[] args) {
        ArrayList<Integer> squares = new ArrayList<>();
        for (int i = 1; i <= 5; i++)
        {
            squares.add(i * i);
        }

        System.out.println(new ObjectAnalyzer().toString(squares));
//        ArrayList<Employee> staff = new ArrayList<>();
//        ArrayList list = staff;
//        ArrayList res = new ArrayList();
//        @SuppressWarnings("unchecked") ArrayList<Employee> test = (ArrayList<Employee>) res;

    }
}
