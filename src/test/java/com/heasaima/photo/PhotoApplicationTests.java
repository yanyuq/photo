package com.heasaima.photo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PhotoApplicationTests {

    static int i = 0;

    @Test
    public void contextLoads() throws ExecutionException, InterruptedException {
        List sl = new ArrayList();
        String[] a = new String[25];
        System.out.println("------------11111111111---1--111111111111111111111111-----------------1------------");
        long t= System.currentTimeMillis();
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a[i++] =   "11111111111111111";
            sl.add(Thread.currentThread().getId());
            return "";
        });
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(300L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a[i++] =   "2222222222222222";
            sl.add(Thread.currentThread().getId());
            return "";
        });
        CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a[i++] =   "3333333333333333";
            sl.add(Thread.currentThread().getId());
            return "";
        });
        CompletableFuture<String> future4 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a[i++] =   "4444444444444444";
            sl.add(Thread.currentThread().getId());
            return "";
        });
        CompletableFuture<String> future5 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a[i++] =   "555555555555555555";
            sl.add(Thread.currentThread().getId());
            return "";
        });
           CompletableFuture<String> future11 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a[i++] =   "111111 11111111111";
            sl.add(Thread.currentThread().getId());
            return "";
        });
        CompletableFuture<String> future12 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(300L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a[i++] =   "22222222 22222222";
            sl.add(Thread.currentThread().getId());
            return "";
        });
        CompletableFuture<String> future13 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a[i++] =   "3333333 333333333";
            sl.add(Thread.currentThread().getId());
            return "";
        });
        CompletableFuture<String> future14 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a[i++] =   "4444444 444444444";
            sl.add(Thread.currentThread().getId());
            return "";
        });
        CompletableFuture<String> future15 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a[i++] =   "5555555555 55555555";
            sl.add(Thread.currentThread().getId());
            return "";
        });
           CompletableFuture<String> future21 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a[i++] =   "11111 1111111 11111";
            sl.add(Thread.currentThread().getId());
            return "";
        });
        CompletableFuture<String> future22 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(300L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a[i++] =   "2222 222222 222222";
            sl.add(Thread.currentThread().getId());
            return "";
        });
        CompletableFuture<String> future23 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a[i++] =   "3333 33333333 3333";
            sl.add(Thread.currentThread().getId());
            return "";
        });
        CompletableFuture<String> future24 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a[i++] =   "44444 44444 444444";
            sl.add(Thread.currentThread().getId());
            return "";
        });
        CompletableFuture<String> future25 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a[i++] =   "55555 5555555 555555";
            sl.add(Thread.currentThread().getId());
            return "";
        });
           CompletableFuture<String> future31 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a[i++] =   "11111 1111 111 11111";
            sl.add(Thread.currentThread().getId());
            return "";
        });
        CompletableFuture<String> future32 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(300L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a[i++] =   "2222 222 222 222222";
            sl.add(Thread.currentThread().getId());
            return "";
        });
        CompletableFuture<String> future33 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a[i++] =   "3333 3333 3333 3333";
            sl.add(Thread.currentThread().getId());
            return "";
        });
        CompletableFuture<String> future34 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a[i++] =   "44444 444 44 444444";
            sl.add(Thread.currentThread().getId());
            return "";
        });
        CompletableFuture<String> future35 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a[i++] =   "55555 555 5555 555555";
            sl.add(Thread.currentThread().getId());
            return "";
        });
           CompletableFuture<String> future41 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a[i++] =   "11111 11 111 11 11111";
            sl.add(Thread.currentThread().getId());
            return "";
        });
        CompletableFuture<String> future42 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(300L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a[i++] =   "2222 2222 22 222 222";
            sl.add(Thread.currentThread().getId());
            return "";
        });
        CompletableFuture<String> future43 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a[i++] =   "3333 33 333 333 3333";
            sl.add(Thread.currentThread().getId());
            return "";
        });
        CompletableFuture<String> future44 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a[i++] =   "44444 44 444 444 444";
            sl.add(Thread.currentThread().getId());
            return "";
        });
        CompletableFuture<String> future45 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a[i++] =   "55555 555 5555 5555 55";
            sl.add(Thread.currentThread().getId());
            return "";
        });
        CompletableFuture all = CompletableFuture.allOf(future1, future2, future3, future4, future5,
                future11, future12, future13, future14, future15,
                future21, future22, future23, future24, future25,
                future31, future32, future33, future34, future35,
                future41, future42, future43, future44, future45);
        System.out.println(System.currentTimeMillis()-t);
        System.out.println(Thread.activeCount());
        all.get();
        System.out.println(System.currentTimeMillis()-t);
        System.out.println(Arrays.toString(a));
        System.out.println(sl.size());
        System.out.println(sl.toString());
    }

}
