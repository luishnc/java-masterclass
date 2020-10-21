package com.luis;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Outlander outlander = new Outlander(36);

        outlander.changeVelocity(20,5);
        outlander.steer(45);
        outlander.accelerate(20);
        outlander.accelerate(-35);

    }
}
