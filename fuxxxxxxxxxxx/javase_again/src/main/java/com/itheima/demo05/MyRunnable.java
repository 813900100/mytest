package com.itheima.demo05;

/**
 * 包名：com.itheima.demo05
 *
 * @author zmm
 * 日期2020-07-28   11:48
 */
public class MyRunnable implements Runnable {
    private Home h;
    public MyRunnable( Home home){
        this.h = home;
    }
    @Override
    public void run() {
       h.into();
    }
}
