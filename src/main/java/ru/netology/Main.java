package ru.netology;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public final static int countThread = 4;

    public static void main(String[] args) throws Exception {
        // создаю поток
        final ExecutorService threadPool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        List<MyCallable> list = new ArrayList<>();
        list.add(new MyCallable(4));
        list.add(new MyCallable(3));
        list.add(new MyCallable(3));
        list.add(new MyCallable(6));

        // Получаем результат
        final Integer resultOfTask = threadPool.invokeAny(list);

        System.out.println(resultOfTask);
        // Завершаем работу пула потоков
        threadPool.shutdown();
    }
}
