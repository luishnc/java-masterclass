package com.luis;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.ReentrantLock;

import static com.luis.Main.EOF;

public class MyConsumer implements Runnable {
    private ArrayBlockingQueue<String> buffer;
    String color;
//    private ReentrantLock bufferLock;

    public MyConsumer(ArrayBlockingQueue<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
//        this.bufferLock = bufferLock;
    }

    public void run() {
//        int counter = 0;
        while (true) {
            synchronized (buffer) {
//            if (bufferLock.tryLock()) {
                try {
                    if (buffer.isEmpty()) {

                        continue;
                    }
//                    System.out.println(color + "The Counter: " + counter);
//                    counter = 0;
                    if (buffer.peek().equals(EOF)) {
                        System.out.println(color + "Exiting");

                        break;
                    } else {
                        System.out.println(color + "Removed" + buffer.take());
                    }

                } catch (InterruptedException e) {
//                    bufferLock.unlock();
                    e.printStackTrace();
                }
//            } else {
//                counter++;
//            }

            }

        }
    }
}
