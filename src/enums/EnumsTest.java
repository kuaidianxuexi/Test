package enums;

import java.util.Arrays;
import java.util.Scanner;

public class EnumsTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE) ");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class,input);
        System.out.println("Size=" + size);
        System.out.println("abbreviation=" + size.getAbbreviation());
        if (size == Size.EXTRA_LARGE)
            System.out.println("Good job--you paid attention to the _.");
        System.out.println(Arrays.toString(Size.values()));
        System.out.println(Size.SMALL.ordinal());
        System.out.println(Size.SMALL.compareTo(Size.LARGE));
    }

    enum Size{
        SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");


        private Size(String abbreviation){
            this.abbreviation = abbreviation;
        }
        public String getAbbreviation(){
            return abbreviation;
        }

        private  String abbreviation;
    }
}
