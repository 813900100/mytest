package com.itheima.demo03;

import lombok.Data;

import java.util.concurrent.CountDownLatch;

/**
 * 包名：com.itheima.demo03
 *
 * @author zmm
 * 日期2020-07-28   11:04
 */

public class MyThread1 extends Thread{
    private CountDownLatch cd1;
    public MyThread1(CountDownLatch cd1){
        this.cd1 =cd1;
    }
    @Override
    public void run() {
        System.out.println("A");
        try {
            cd1.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("C");

    }
}
