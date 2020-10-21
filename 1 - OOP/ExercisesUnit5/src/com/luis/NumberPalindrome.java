package com.luis;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int original = number;
        int reverse = 0;
        while (number != 0) {
            int lsd = number % 10;
            reverse *= 10;
            reverse += lsd;
            number /= 10;
        }
        return reverse == original ? true : false;
    }


}
