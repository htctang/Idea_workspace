package com.tang.test;

/**
 * Created by 唐川htc on 2016/1/3.
 */
public class Test3 {
    private String test;
    static Integer test2=22;
    Test3(){
        System.out.println("");
    }
    Test3(String str){
        test=str;
    }
    @Override
    public String toString() {
        return "Test3{" +
                "test='" + test + '\'' +
                '}';
    }
    public void testD(){
        System.out.println("dddddTestD");
    }

}
