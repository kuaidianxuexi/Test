package objectAnalyzer;

import equals.Employee;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) {
        Employee harry = new Employee("Harry Hacker", 35000, 1989, 10, 1 );
        Class cl = harry.getClass();
        //the class object representing Employee
        try{
            Field f = cl.getDeclaredField("name");
            Field x = cl.getDeclaredField("salary");
            f.setAccessible(true);
            x.setAccessible(true);
        //the name field of the Employee class
            Object v = f.get(harry);
            Object m = x.get(harry);
            System.out.println(m);
            x.set(harry,45000);
            m = x.get(harry);
            System.out.println(m);
            System.out.println(v);
        }catch (Exception e){
            e.printStackTrace();
        }
        //the value of the name field of the harry object, i.e., the String object "Harry Hacker"
    }
}
