package com.luis;

public class CountdownThread extends Thread{

    private Countdown threadCountdown;

    public CountdownThread(Countdown threadCountdown) {
        this.threadCountdown = threadCountdown;
    }

    public void run(){
        threadCountdown.doCountdown();
    }
}
