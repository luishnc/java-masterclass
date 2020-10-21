package academy.learnprogramming.com;

public class BarkingDog {

    public static boolean shouldWakeUp (boolean barking,int hourOfDay){
        if (hourOfDay <0 || hourOfDay >23){
            return false;
        } else if (hourOfDay < 8 && barking == true || hourOfDay > 22 && barking == true){
            return true;
        }
        return false;
    }
}
