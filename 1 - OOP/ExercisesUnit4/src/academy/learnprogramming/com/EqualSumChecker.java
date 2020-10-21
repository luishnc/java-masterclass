package academy.learnprogramming.com;

public class EqualSumChecker {

    public static boolean hasEqualSum (int num1,int num2, int num3){
        boolean returnValue = false;

        returnValue = num1 + num2 == num3 ? true : false;

        return returnValue;


    }

}
