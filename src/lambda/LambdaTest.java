package lambda;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

/**
 * This program demonstrates the use of lambda expressions/
 */
public class LambdaTest {
    public static void main(String[] args) {
        
        String[] planets = new String[]{"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictionary order:");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by length:");
        Arrays.sort(planets, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));

        Timer t = new Timer(1000, event -> System.out.println("The time is " + new Date()));
        t.start();

        // keep program running until user selects "OK"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0 );
    }
}
