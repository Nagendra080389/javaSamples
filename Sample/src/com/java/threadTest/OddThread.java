package com.java.threadTest;

/**
 * Created by Nagendra on 18-10-2016.
 */
public class OddThread implements Runnable {

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 10; i = i + 2) {
                System.out.println("Odd -- > " + i);
            }
        }
    }
}
