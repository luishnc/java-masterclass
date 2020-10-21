package com.luis;

public class Main {

    public static void main(String[] args) {

        int switchValue = 6;

        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Value was " + switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2 or 3 or 4 or 5");
                break;
        }

    }
}
