package com.lft.secretgarden.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by liufeitian on 16/9/29.
 */
public class ThreadPool {
    private static int maxthreadcount = 0;
    public static ThreadPool getsigleton = new ThreadPool();
    private static ExecutorService pool = Executors.newCachedThreadPool();

    public void testPool(final  TaskHander t){
        pool.execute(new Runnable() {
            public void run() {
                try{
                    t.runTask();
                }catch (Exception e){

                }

            }
        });
    }
}
