package com.itheima.demo05;

/**
 * 包名：com.itheima.demo05
 *
 * @author zmm
 * 日期2020-07-28   11:53
 */
public class DoMain {
    public static void main(String[] args) {
        Home home = new Home();
        MyRunnable mr = new MyRunnable(home);
        new Thread(mr,"同学一").start();
        new Thread(mr,"同学二").start();
        new Thread(mr,"同学三").start();
        new Thread(mr,"同学四").start();
        new Thread(mr,"同学五").start();
    }
}
