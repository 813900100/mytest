package com.itheima.demo03;

import org.junit.Test;

import java.util.concurrent.CountDownLatch;

/**
 * 包名：com.itheima.demo03
 *
 * @author zmm
 * 日期2020-07-28   11:17
 */
public class DoMain {
    public static void main(String[] args) {
        CountDownLatch cd1 = new CountDownLatch(1);
        new MyThread1(cd1).start();
        new MyThread2(cd1).start();

    }

}
