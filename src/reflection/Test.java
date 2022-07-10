package reflection;

import equals.Employee;

import java.lang.reflect.Constructor;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Employee e = new Employee("12",123,1234,12,3);
        Class cl = e.getClass();
        String s = "equals.Employee";
        try {
            Constructor cn = cl.getConstructor(String.class,double.class,int.class,int.class,int.class);
            Employee m =(Employee) cn.newInstance("12",123,1234,12,3);
            System.out.println(m);
        }catch (Exception x){
            x.printStackTrace();
        }
        /*try {
            Object m = Class.forName(s).getConstructor(Class.forName(s)).newInstance("12",123,1234,12,3);
            Employee f = (Employee) m;
            System.out.println(f);
        }catch (Exception x){
            x.printStackTrace();
        }*/
        /*try{
             Object m = Object.class.getConstructor(cl).newInstance("13",1233,1214,12,1);

        }catch(Exception x){
            x.printStackTrace();
        }*/
        System.out.println(cl.getName());
        System.out.println(e.getClass() == Employee.class);
    }
}
