package com.fgm.test;

import java.util.ArrayList;

/**
 * @author fgm
 * @create 2020-05-10 14:32
 */
public class test_1 {

    public static void main(String[] args) {
        System.out.println("你好啊，小明。");
        int[] nums = {140, 155, 65, 77, 21, 15};

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            System.out.print(num + ",");
        }
        System.out.println();
        ArrayList arrayList = new ArrayList();
        arrayList.add("唐三");
        arrayList.add("沐白");
        arrayList.add("红俊");
        arrayList.add("小奥");
        for (Object o : arrayList) {
            System.out.print(o);
        }


    }
}
