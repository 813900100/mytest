package com.itheima.demo04;

import java.util.concurrent.CyclicBarrier;

/**
 * 包名：com.itheima.demo04
 *
 * @author zmm
 * 日期2020-07-28   11:32
 */
public class DoMain {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(4,new Metting());
        MyRunnable mr = new MyRunnable(cb);
        new Thread(mr,"一号").start();
        new Thread(mr,"二号").start();
        new Thread(mr,"三号").start();
        new Thread(mr,"四号").start();
    }
}
