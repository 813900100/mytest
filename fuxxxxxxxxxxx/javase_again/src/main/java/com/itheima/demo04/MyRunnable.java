package com.itheima.demo04;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * 包名：com.itheima.demo04
 *
 * @author zmm
 * 日期2020-07-28   11:28
 */
public class MyRunnable implements Runnable {
    private CyclicBarrier cb ;
    public MyRunnable(CyclicBarrier cb){
        this.cb = cb;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"到达会议室");
        try {
            cb.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"离开了会议室");
    }
}
