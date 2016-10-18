package com.java.threadTest;

/**
 * Created by Nagendra on 18-10-2016.
 */
public class ThreadTest {

    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();

        Thread even = new Thread(evenThread);
        Thread odd = new Thread(oddThread);

        even.start();
        odd.start();
    }
}
