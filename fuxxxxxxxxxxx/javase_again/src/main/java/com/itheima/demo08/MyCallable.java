package com.itheima.demo08;

import java.util.concurrent.Callable;

/**
 * 包名：com.itheima.demo08
 *
 * @author zmm
 * 日期2020-07-28   15:13
 */
public class MyCallable implements Callable<Integer> {
    private Integer n;
    public MyCallable(Integer n){
        this.n = n;
    }
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (Integer i = 1; i <= n; i++) {
            sum+=i;
        }
        Thread.sleep(3000);
        return sum;
    }
}
