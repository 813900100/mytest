package com.itheima.demo02;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 包名：com.itheima.demo02
 *
 * @author zmm
 * 日期2020-07-28   10:18
 */
public class DOMain {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new MyThread().start();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < MyThread.arr.length(); i++) {
            System.out.print(MyThread.arr.get(i));
        }

    }
}
