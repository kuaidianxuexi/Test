package arrays;

import equals.Employee;
import equals.Manager;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

public class CopyOfTest {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        a = (int[]) goodCopyOf(a,10);
        System.out.println(Array.get(a,2).getClass());
        System.out.println(Array.getInt(a, 2));

        String[] b = {"Tom", "Dick", "Harry"};
        b = (String[]) goodCopyOf(b,10);
        System.out.println(Arrays.toString(b));

        System.out.println("The following call will generate an exception");
        b = (String[]) badCopyOf(b, 10);
//
//        Employee t = new Employee("12", 3243, 1987, 12, 12);
//        Class cl = t.getClass();
//        try {
//            Field f = cl.getDeclaredField("name");
//            System.out.println(f);
//            System.out.println(f.getType().isPrimitive());
//        } catch (NoSuchFieldException e) {
//            e.printStackTrace();
//        }
//        System.out.println(cl.isPrimitive());
        /*Employee[] t = new Employee[3];
        Class cl = t.getClass();
        System.out.println(cl.isArray());
        System.out.println(cl.getComponentType());*/
    }

    /**
     * This method attempts to grow an array by allocating a new array and copying all elements.
     * @param a the array to grow
     * @param newLength the new length
     * @return a larger array that contains all elements of a. However, the returned array has
     * type Object[], not the same type as a
     */
    public static Object[] badCopyOf(Object[] a, int newLength)
    {
        Object[] newArray = new Object[newLength];
        System.arraycopy(a, 0 , newArray, 0, Math.min(a.length,newLength));
        return newArray;
    }

    /**
     *This method grows an array by allocating a new array of the same type and
     * copying all elements.
     * @param a the array to grow. This can be an object array or a primitive
     *          type array
     * @param newLength
     * @return a larger array that contains all elements of a.
     */
    public static Object goodCopyOf(Object a, int newLength)
    {
        Class cl = a.getClass();
        if (!cl.isArray())
            return null;
        Class componentType = cl.getComponentType();
        int length = Array.getLength(a);
        Object newArray = Array.newInstance(componentType, newLength);
        System.arraycopy(a, 0 , newArray, 0, Math.min(length,newLength));

        return newArray;
    }
}
