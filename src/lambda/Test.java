package lambda;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Test {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.init();
    }

}

class Demo{
    public void init()
    {
        ActionListener listener = event -> System.out.println(this.toString());
        new Timer(0,listener).start();
    }
}
