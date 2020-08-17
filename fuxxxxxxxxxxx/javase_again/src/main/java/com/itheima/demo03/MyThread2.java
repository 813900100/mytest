package com.itheima.demo03;

import lombok.Data;

import java.util.concurrent.CountDownLatch;

/**
 * 包名：com.itheima.demo03
 *
 * @author zmm
 * 日期2020-07-28   11:16
 */

public class MyThread2 extends Thread {
    private CountDownLatch cd1;
        public MyThread2(CountDownLatch cd1){
            this.cd1 = cd1;
        }
    @Override
    public void run() {

        System.out.println("B");
        cd1.countDown();
    }
}
