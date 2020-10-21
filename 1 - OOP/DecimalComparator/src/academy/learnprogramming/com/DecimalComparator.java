package academy.learnprogramming.com;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DecimalComparator{

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {

        firstNumber *= 1000;

        secondNumber *= 1000;

        if((int)firstNumber == (int)secondNumber) {

            return true;

        }

        return false;

    }

}