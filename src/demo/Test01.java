package demo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;

public class Test01 {
    public static void main(String[] args) {

        /*System.out.println(new Date().toString());
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.of(2002,10,27));
        LocalDate test = LocalDate.now();
        System.out.println(test.getYear());
        System.out.println(test.getMonthValue()+"-----"+test.getMonth());
        System.out.println(test.getDayOfMonth());
        LocalDate aThousandDaysLater = test.plusDays(1100);
        System.out.println(aThousandDaysLater.getYear());
        System.out.println(aThousandDaysLater.getMonthValue());
        System.out.println(aThousandDaysLater.getDayOfMonth());*/
        LocalDate date = LocalDate.now ();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
        date = date.minusDays(today-1);
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for(int i = 1;i<value;i++){
            System.out.print("    ");
        }
        while(date.getMonthValue() == month){
            System.out.printf("%3d",date.getDayOfMonth());
            if(date.getDayOfMonth() == today){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
            date = date.plusDays(1);
            if(date.getDayOfWeek().getValue() == 1){
                System.out.println();
            }

        }
        Test00 aa = new Test00();
    }
}
