package com.itheima.demo06;

import java.util.concurrent.Exchanger;

/**
 * 包名：com.itheima.demo06
 *
 * @author zmm
 * 日期2020-07-28   14:42
 */
public class MyThread2 extends Thread {
    private Exchanger<String> ex;
    public MyThread2(Exchanger<String> ex){
        this.ex = ex;
    }

    @Override
    public void run() {
        String message2 = "";
        try {
            message2 = ex.exchange("我是线程二");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程二:"+message2);

    }
}
