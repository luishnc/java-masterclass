package com.luis;

import java.util.Scanner;

public class Main {




    public static void main(String[] args) {
        // Create a program using arrays that sorts a list of integers in descending order.
        // Descending order is highest value to lowest.
        // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
        // ultimately have an array with 106,81,26, 15, 5 in it.
        // Set up the program so that the numbers to sort are read in from the keyboard.
        // Implement the following methods - getIntegers, printArray, and sortIntegers
        // getIntegers returns an array of entered integers from keyboard
        // printArray prints out the contents of the array
        // and sortIntegers should sort the array and return a new array containing the sorted numbers
        // you will have to figure out how to copy the array elements from the passed array into a new
        // array and sort them and return the new sorted array.

        printArrays(sortIntegers(getIntegers(5)));






    }

    public static int[] sortIntegers(int[] values){
        //int[] tempArray = new int[values.length];
        //tempArray = values;

        for (int i = values.length-1; i > 0; i--) {

            for (int j = 0; j < i; j++) {

                if (values[j] < values[j+1]){

                    int aux = values[j];
                    values[j] = values[j+1];
                    values[j+1] = aux;

                }

            }

        }


        return values;
    }

    public static int[] getIntegers(int numbers){
        Scanner scanner = new Scanner(System.in);
        int[] values = new int[numbers];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();

        }

        return values;

    }

    public static void printArrays(int[] values) {
        for (int i = 0; i < values.length; i++) {

            System.out.println("Number sorted:" + values[i]);

        }
    }




}
