package com.luis;

import static com.luis.ThreadColor.*;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from My Runnable's implementation of run()");
    }
}
