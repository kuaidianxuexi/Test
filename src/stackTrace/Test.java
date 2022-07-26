package stackTrace;

import java.io.PrintWriter;
import java.io.StringWriter;

public class Test {
    public static void main(String[] args) {
        Throwable t = new Throwable();
        StringWriter out = new StringWriter();
        t.printStackTrace(new PrintWriter(out));
        String description = out.toString();
        System.out.println(description);
    }
    public static int f(int n)
    {
        try
        {
            int r = n * n;
            return r;
        }
        finally
        {
            if (n == 2) return 0;
        }
    }
}
