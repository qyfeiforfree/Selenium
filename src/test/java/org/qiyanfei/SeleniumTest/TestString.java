package org.qiyanfei.SeleniumTest;

/**
 * Created by qyfei on 2016-3-10.
 */
public class TestString {
    public static   void main (String[] agrs){
        String a = "Hello";
        LinkText(a);
        System.out.println(a);
        String b = "JA";
        String c = "VA";
        System.out.println(b+c =="JAVA");
        System.out.println((b+c).equals("JAVA"));

    }
    public static void   LinkText(String a){
        a+="World";
        System.out.println(a);

    }
}
