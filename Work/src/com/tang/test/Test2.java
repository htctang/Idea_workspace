package com.tang.test;

/**
 * Created by 唐川htc on 2016/1/3.
 */
public class Test2 {
    public static void main(String[] args) {
        int x=4;
        System.out.println("value is"+(x>4?99.9:9));

        System.out.println(9);
        float f= 2.3f;
        double d=2.3;
        Float ftest = f;
        Double dd = d;

        Test3 test3 = new Test3("dd");
        System.out.println(Test3.test2);
        System.out.println(test3.test2);
        Test3.test2=3;
        System.out.println(Test3.test2);

        String test4 ="dddd";
        String test5 = "dddeeDDDfFFFeeFFDDHH";
        System.out.println(test4.toUpperCase());
        System.out.println(test5.toLowerCase());
        System.out.println(test5.toUpperCase());
        System.out.println(test5.charAt(5));
        System.out.println(test5.endsWith("H"));
//        System.out.println(test5.);
        StringBuffer strb = new StringBuffer("java");
        strb.append("dddd");
        strb.reverse();
        System.out.println(strb.toString());

        System.out.println();
    }
}
