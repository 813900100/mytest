package com.itheima.demo07;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 包名：com.itheima.demo07
 *
 * @author zmm
 * 日期2020-07-28   14:59
 */
public class DoMain {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        MyRunnable mr = new MyRunnable();
         executorService.submit(mr);

        executorService.submit(mr);
        executorService.submit(mr);
        executorService.submit(mr);
    }
}
