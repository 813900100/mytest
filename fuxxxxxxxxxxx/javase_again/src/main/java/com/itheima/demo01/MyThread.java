package com.itheima.demo01;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 包名：com.itheima.demo01
 *
 * @author zmm
 * 日期2020-07-28   10:07
 */
public class MyThread extends Thread{
    public static AtomicInteger a = new AtomicInteger();

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            a.getAndIncrement();
        }
    }
}
