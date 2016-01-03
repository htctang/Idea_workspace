package com.tang.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by 唐川htc on 2015/12/28.
 */
public class Test {
    public static void main(String[] args) {
        try{
//            InputStream
            File file=new File("e://File.txt");
            Scanner num = new Scanner(System.in);
            System.out.println("请输入要录入的内容");
            String b = num.nextLine();
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(b);
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
