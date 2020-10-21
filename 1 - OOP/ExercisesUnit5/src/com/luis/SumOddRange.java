package com.luis;

public class SumOddRange {

    public static boolean isOdd(int number){
        if (number<0){
            return false;
        }

        if (number == 1){
            return true;

        }

        if (number % 2 == 0){
            return false;
        }

        return true;

    }

    public static int sumOdd (int start,int end){
        int i =0;

        if (end < start){
            return -1;
        } else if(start <0 || end < 0){
            return -1;
        }

        for (;start <= end;start ++){
            if (isOdd(start) == true){
                i += start;
            }
        }

        return  i;

    }
}
