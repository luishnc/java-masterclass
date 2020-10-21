package com.luis;

import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


    	int[] myIntegers = getIntegers(5);

		for (int i = 0; i < myIntegers.length; i++) {
			System.out.println(myIntegers[i]);

		}

		System.out.println("Avarage of my array: " + getAvarage(myIntegers) );


	}

	public static int[] getIntegers(int myIntegers){

		int[] values = new int[myIntegers];

		for (int i = 0; i < myIntegers ; i++) {

			System.out.println("Type next int: ");
			values[i] = scanner.nextInt();
		}

		return values;

	}

	public static double getAvarage(int[] array){
    	int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];

		}

		return (double) sum / (double)array.length;
	}
}
