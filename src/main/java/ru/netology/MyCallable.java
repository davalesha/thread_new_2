package ru.netology;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    private int exit;

    public MyCallable(int exit) {
        this.exit = exit;
    }

    @Override
    public Integer call() throws Exception {
        int result = 0;
        while (result < exit) {
            Thread.sleep(2500);
            System.out.println("Я" + Thread.currentThread().getName() + " Всем привет!");
            result++;
        }
        System.out.println(Thread.currentThread().getName() + "завершен. Кол-во сообщений: " + result);
        return result;
    }
}
