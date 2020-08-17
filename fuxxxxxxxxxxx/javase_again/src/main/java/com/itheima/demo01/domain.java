package com.itheima.demo01;

/**
 * 包名：com.itheima.demo01
 *
 * @author zmm
 * 日期2020-07-28   10:12
 */
public class domain {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        for (int i = 0; i < 100000; i++) {
            mt.a.getAndIncrement();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }
        System.out.println(mt.a);
    }
}
