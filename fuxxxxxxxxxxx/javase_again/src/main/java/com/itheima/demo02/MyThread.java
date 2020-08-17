package com.itheima.demo02;

import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * 包名：com.itheima.demo02
 *
 * @author zmm
 * 日期2020-07-28   10:16
 */
public class MyThread extends Thread {
    public static AtomicIntegerArray arr = new AtomicIntegerArray(1000);

    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {
            arr.getAndAdd(i,1);
        }
    }
}
