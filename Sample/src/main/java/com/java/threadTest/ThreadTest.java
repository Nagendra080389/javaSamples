package com.java.threadTest;

/**
 * Created by Nagendra on 18-10-2016.
 */
public class ThreadTest {

    static Object lock = new Object();

    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();

        Thread even = new Thread(evenThread);
        Thread odd = new Thread(oddThread);

        even.start();
        odd.start();

        try {
            even.join();
            odd.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static class EvenThread implements Runnable {

        @Override
        public void run() {
            synchronized (lock) {
                for (int i = 0; i <= 10; i = i + 2) {
                    System.out.println("Even -- > " + i);
                }
            }
        }
    }

    public static class OddThread implements Runnable {

        @Override
        public void run() {
            synchronized (lock) {
                for (int i = 1; i <= 10; i = i + 2) {
                    System.out.println("Odd -- > " + i);
                }
            }
        }
    }
}
