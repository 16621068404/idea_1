package com.fgm.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HelloWorld {

    private int num;

    public static void main(String[] args) {
        System.out.println("你好，idea");
        List strList = new ArrayList();
        strList.add(123);
        FindStudent();
        //testMethed();

    }

    private static void testMethed() {

        try {
            FileInputStream in = new FileInputStream("hellow.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


    private static void FindStudent() {
        System.out.println("你好啊，小宝贝。你好。你好啊.");
        System.out.println("你好啊，小美女。你好.");
        Date date = new Date();   //  ALT+ENTER  快捷键  补充返回值
        System.out.println(date.toString());



    }

}
