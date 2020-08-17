package com.itheima.demo06;

import java.util.concurrent.Exchanger;

/**
 * 包名：com.itheima.demo06
 *
 * @author zmm
 * 日期2020-07-28   14:45
 */
public class DoMain {
    public static void main(String[] args) {
        Exchanger<String> ex = new Exchanger<>();
        new MyThread1(ex).start();
        new MyThread2(ex).start();
    }
}
