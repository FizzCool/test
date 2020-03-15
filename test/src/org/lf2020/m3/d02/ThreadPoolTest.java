package org.lf2020.m3.d02;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @ClassName: ThreadPoolTest
 * @Description: TODO
 * @Author: 梁飞
 * @Date: 2020/3/2 19:09
 */
public class ThreadPoolTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future f1 = es.submit(new MyCallable(100));
        Future f2 = es.submit(new MyCallable(1000));
        System.out.println(f1.get());
        System.out.println(f2.get());
    }
}
