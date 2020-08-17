package com.itheima.demo05;

import java.util.concurrent.Semaphore;

/**
 * 包名：com.itheima.demo05
 *
 * @author zmm
 * 日期2020-07-28   11:45
 */
public class Home {

   Semaphore sp = new Semaphore(1);

    void into(){
        try {
            sp.acquire();
            System.out.println(Thread.currentThread().getName()+"进来了");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"出去了");
        sp.release();
    }
}
