package com.formcalculations;

public class Series {

    public static int nSum(int n) {

        if (n < 0 || n > 10) {
            System.out.println("Number outside the range limit");
            return 0;
        } else {
            int totalSum = 0;
            int[] arrayInt = {0, 1, 3, 6, 10, 15, 21, 28, 36, 45, 55};

            for (int i = 0; i <= n; i++) {

                totalSum += arrayInt[i];

            }

            return totalSum;
        }


    }

    public static long factorial(int n) {

        if (n == 0) {
            return 1;
        }

        long fact = 1;

        for (int i = 1; i <= n; i++) {

        }


        return fact;

    }

    public static int fibonacci(int n) {
        if (n < 0 || n > 10) {
            System.out.println("Number outside the range limit");
            return 0;
        } else {


            int[] arrayInt = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
            if (n == 0) {
                return 0;
            }

            if (n == 1 || n == 2) {
                return 1;
            } else {
                return (arrayInt[n] - 1) + (arrayInt[n] - 2);

            }


        }
    }
    // f(0) = 0
    // f(1) = 1
    // f(n) = f(n-1) + f(n-2)
    // (so f(2) is also 1. The first 10 fibonacci numbers are:
    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55.

}
