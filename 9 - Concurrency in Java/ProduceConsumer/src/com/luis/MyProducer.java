package com.luis;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.ReentrantLock;

public class MyProducer implements Runnable {
    private ArrayBlockingQueue<String> buffer;
    private String color;
    //private ReentrantLock bufferLock;

    public MyProducer(ArrayBlockingQueue<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
//        this.bufferLock = bufferLock;
    }

    public void run() {
        Random random = new Random();
        String[] nums = {"1", "2", "3", "4", "5"};

        for (String num : nums
        ) {

            try {
                System.out.println(color + "Adding..." + num);
                buffer.put(num);
////                bufferLock.lock();
//                try {
//                    buffer.add(num);
//                } finally {
////                    bufferLock.unlock();
//                }

                Thread.sleep(1000);

            } catch (InterruptedException e) {
                System.out.println("Producer was interrupted");

            }
        }
        System.out.println(color + "Adding EOF and exiting...");

//        bufferLock.lock();
        try {
            buffer.put("EOF");
        } catch (InterruptedException e){
//            bufferLock.unlock();
        }


    }
}
