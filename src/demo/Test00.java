package demo;

import java.io.Console;

public class Test00 {
    public static void main(String[] args) {
        /** String s = "Hello";
        int n = s.length();
        int cpCount = s.codePointCount(0,s.length());
        System.out.println(cpCount);
        int index = s.offsetByCodePoints(0,3);
        int cp = s.codePointAt(index);
        System.out.println(index);
        System.out.println(cp);
        System.out.println((int)'l');
        int i =0;
        int cp = s.codePointAt(i);
        if(Character.isSupplementaryCodePoint(cp)) i+=2;
        else i++;
        System.out.println((char)cp);
        cp = s.codePointAt(i);
        System.out.println((char)cp);
        int[] i_s = s.codePoints().toArray();
        System.out.println(i_s[1]);
        String s1=new String(i_s,1,4);
        System.out.println(s1);
        boolean x = s.equalsIgnoreCase(s1);
        System.out.println(x);
        String s2 = s.toUpperCase();
        System.out.println(s2);
        String s3 = s2.toLowerCase();
        System.out.println(s3);*/

        StringBuilder ss = new StringBuilder("java hello");
        ss.setCharAt(4,'*');
        System.out.println(ss);
        ss.insert(4," ");
        System.out.println(ss);
        ss.insert(6,' ');
        System.out.println(ss);
        ss.delete(4,6);
        System.out.println(ss);
        String ss1 = ss.toString();
        System.out.println(ss1);


        /*Console con = System.console();
        char[] arr = con.readPassword("Password:");
        String ss3 = new String(arr);
        System.out.println(ss3);*/

        /**
         *Scanner s = new Scanner(Paths.get("文件路径"),"UTF-8")
         * Sting dir = System.getProperty("user.dir")//找到当前程序路径位置
         * PrintWriter = new PrintWriter("文件路径","UTF-8");
         */

        /*String dir = System.getProperty("user.dir");
        System.out.println(dir);*/


    }
}
