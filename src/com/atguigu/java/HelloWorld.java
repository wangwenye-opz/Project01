package com.atguigu.java;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HelloWorld {
    //Shift+回车 == 换上行
    //Ctrl+Shift+回车 ==换下行
    public static void main(String[] args) {

        System.out.println("HelloWorld");
        System.out.println("HelloWorld"

        );
        //region Description
        regionDescription();
        try {
            int i = 1/0;
        } catch (Exception e) {
            e.printStackTrace();
        }

        int[] a = {1,2,3};


        System.out.println("args = [" + args + "]");
        System.out.println("HelloWorld.main");
    }

    private static void regionDescription() {
        List a1 = new ArrayList();
        //endregion
        a1.add(0,123);
        int[] a2 = new int[10];
        int length = a2.length;
        System.out.println(length);
        Date date = new Date();
        System.out.println("HelloWorld");
    }
}
