package academy.learnprogramming.com;

public class Main {

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " +myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " +myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue = (float) 5.25;
        double myDoubleValue = 5.25d;

        /*Challenge*/

        float myPounds = 10;
        float poundToKG = 0.45359237f;
        float total = myPounds * poundToKG;
        System.out.println("My Total in KG: " + total);


    }
}
