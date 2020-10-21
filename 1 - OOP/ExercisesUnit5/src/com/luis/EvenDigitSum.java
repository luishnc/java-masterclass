package com.luis;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }

        int sum = 0;

        //125 -> 125 /10 = 12 -> 12 * 10 = 120 -> 125-120 = 5
        while (number > 0) {
            //Extract lest significant digit
            int digit = number % 10;

            if (digit % 2 == 0) {
                sum += digit;
            }


            //Iteration dropping least significant digit
            number /= 10;

        }
        return sum;
    }
}
