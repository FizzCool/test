package org.lf2020.m3.d02;

import java.util.concurrent.Callable;

/**
 * @ClassName: MyCallable
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/2 19:11
 */
public class MyCallable implements Callable<Integer> {
    public int n;
    public int result;

    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public Integer call() throws Exception {
        for (int i = 0; i < n; i++) {
            result += i;
        }
        return result;
    }
}
