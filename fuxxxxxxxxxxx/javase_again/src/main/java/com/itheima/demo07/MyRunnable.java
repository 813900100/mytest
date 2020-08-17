package com.itheima.demo07;

/**
 * 包名：com.itheima.demo07
 *
 * @author zmm
 * 日期2020-07-28   14:57
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"开始执行任务");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"任务结束");
    }
}
