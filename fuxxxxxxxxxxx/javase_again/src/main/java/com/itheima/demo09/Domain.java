package com.itheima.demo09;

import lombok.Synchronized;

/**
 * 包名：com.itheima.demo09
 *
 * @author zmm
 * 日期2020-07-28   15:42
 */
public class Domain {
    static Object obj = new Object();
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("准备进入无线等待");
               synchronized (obj){
                   try {
                       obj.wait();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   System.out.println("被唤醒");
               }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized(obj){
                    System.out.println("准备唤醒无线等待中的进程");
                    obj.notify();
                }
            }
        }).start();
    }
}
