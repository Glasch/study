package sample.chapter4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.*;

/**
 * Copyright (c) Anton on 04.07.2017.
 */
/* Ex.4 p. 131 */
public class SimpleNumbers {

    static int poisk(int from, int to) {
        boolean simple;
        int count = 0;
        for (int delimoe = from; delimoe <= to; delimoe++) {
            simple = checkSimple(delimoe);
            if (simple) {
                count++;
            }
        }
        return count;
    }


    static int poiskParallel(int from ,int to, int threads) {
        Map<Thread,ParallelSearcher> threadsMap = new HashMap<>();
        boolean simple;
        int step = (to - from) / threads;
        int startIndex = from;
        for (int i = 0; i < threads; i++) {
            int endIndex = startIndex + step;
            if(i == threads - 1){
                endIndex = to;
            }
            ParallelSearcher parallelSearcher = new ParallelSearcher(startIndex, endIndex);
            Thread thread = new Thread(parallelSearcher);
            thread.start();
            threadsMap.put(thread,parallelSearcher);
            startIndex += step;
        }
        int result = 0;
        for (Thread thread : threadsMap.keySet()) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new IllegalStateException();
            }
            result += threadsMap.get(thread).getCount();
        }
        return result;
    }

    static int poiskParallelTP(int from ,int to, int threads) {
        ExecutorService threadPool = Executors.newFixedThreadPool(threads);
        HashSet<Future<Integer>> futures = new HashSet<>();
        int step = (to - from) / threads;
        int startIndex = from;
        for (int i = 0; i < threads; i++) {
            int endIndex = startIndex + step;
            if(i == threads - 1){
                endIndex = to;
            }
            ParallelSearcherCall parallelSearcher = new ParallelSearcherCall(startIndex, endIndex);
            Future<Integer> future = threadPool.submit(parallelSearcher);
            futures.add(future);
            startIndex += step;
        }
        int result = 0;
        for (Future<Integer> future : futures) {
            try {
                 result += future.get();
            } catch (Exception e) {
               throw new IllegalStateException();
            }
        }
        return result;
    }


    public static boolean checkSimple(int delimoe) {
        for (int delitel = 2; delitel < delimoe; delitel++) {
            if (delimoe % delitel == 0) {
                return false;
            }
        }
        return true;
    }

    private static class ParallelSearcher implements Runnable {
        private int from;
        private int to;
        private int count = 0;
        public ParallelSearcher(int from, int to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public void run() {
            count = poisk(from, to);
        }

        public int getCount() {
            return count;
        }
    }

    private static class ParallelSearcherCall implements Callable<Integer> {
        private int from;
        private int to;
        private int count = 0;
        public ParallelSearcherCall(int from, int to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public Integer call() {
            return  poisk(from, to);
        }

        public int getCount() {
            return count;
        }
    }

}

