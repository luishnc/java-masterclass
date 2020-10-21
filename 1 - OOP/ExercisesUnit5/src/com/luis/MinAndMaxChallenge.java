package com.luis;

import java.util.Scanner;

public class MinAndMaxChallenge {

    public static void challange (){

        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean firstNumber = true;


        while(true){

            System.out.println("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();






            if (isAnInt){

                int number = scanner.nextInt();

                if (firstNumber == true) {

                    min = number;
                    firstNumber = false;
                }

                if (number < min){
                    min = number;
                }else if (number > max){
                    max = number;
                }
            }
            else {
                break;
            }


            System.out.println("Min: " + min + " Max: " + max);

    }
        scanner.close();

    }
}
