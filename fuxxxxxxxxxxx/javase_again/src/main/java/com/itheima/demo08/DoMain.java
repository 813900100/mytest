package com.itheima.demo08;

import java.util.concurrent.*;

/**
 * 包名：com.itheima.demo08
 *
 * @author zmm
 * 日期2020-07-28   15:16
 */
public class DoMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(1);
        MyCallable mc = new MyCallable(100);
        Future<Integer> submit = es.submit(mc);
        System.out.println(submit.get());
        MyCallable mc1 = new MyCallable(50);
        Future<Integer> submit1 = es.submit(mc1);
        System.out.println(submit1.get());
    }
}
