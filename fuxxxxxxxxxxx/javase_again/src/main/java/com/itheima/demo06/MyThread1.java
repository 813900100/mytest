package com.itheima.demo06;

import java.util.concurrent.Exchanger;

/**
 * 包名：com.itheima.demo06
 *
 * @author zmm
 * 日期2020-07-28   14:39
 */
public class MyThread1 extends Thread{
    private Exchanger<String> ex;
    public MyThread1(Exchanger<String> ex){
        this.ex = ex;
    }

    @Override
    public void run() {
        String message1 = "";
        try {
             message1 = ex.exchange("我是线程一");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程一:"+message1);
    }
}
