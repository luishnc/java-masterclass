package com.luis;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){

        if (number <0 ) {
            return -1;
        }

        String numConverter = Integer.toString(number);

        int num1; int num2;
        num1 = Integer.parseInt(numConverter.substring(0,1));
        num2 = Integer.parseInt(numConverter.substring(numConverter.length() -1 ));

        return num1 + num2;
    }
}
