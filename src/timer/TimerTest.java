package timer;

// to resolve conflict with java.util.Timer

import javax.swing.*;
import java.awt.*;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class TimerTest {
    public static void main(String[] args) {
        ActionListener listener = new TimerPrinter();

        // construct a timer that calls the listener
        // once every  10 seconds
        Timer t = new Timer(1000 * 60 * 10, listener);
        t.start();
        JOptionPane.showMessageDialog(null, "Quit program?");

        System.exit(0);
    }
}
class TimerPrinter implements ActionListener{
    public void actionPerformed(ActionEvent event)
    {
        System.out.println("At the tone, the time is " + new Date());
        Toolkit.getDefaultToolkit().beep();
    }
}