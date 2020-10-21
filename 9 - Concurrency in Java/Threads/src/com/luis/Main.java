package com.luis;

import static com.luis.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from the main thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("==Another Thread==");

        anotherThread.start();

        new Thread(){
            public void run(){
                System.out.println(ANSI_GREEN + "Hello form the anonymous class thread");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable(){
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from the anonymous class's implementation of run()");
                try {
                    anotherThread.join(2000);
                    System.out.println(ANSI_RED+"Another thread terminate, or timed out, so I am running again");

                } catch (InterruptedException e){
                    System.out.println(ANSI_RED+"I could not wait after all. I was interrupted for some reason.");
                }
            }


        });
        myRunnableThread.start();
//        anotherThread.interrupt();

        System.out.println(ANSI_CYAN+"Hello again from the main thread");






    }
}
