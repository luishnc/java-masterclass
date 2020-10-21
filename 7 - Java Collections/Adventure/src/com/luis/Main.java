package com.luis;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locationHashMap = new HashMap<>();

    public static void main(String[] args) {

        //Map<Integer, Location> locations = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> tempExit = new HashMap<>();

        locationHashMap.put(0, new Location(0, "Location 0 Exit",tempExit));



        tempExit = new HashMap<>();
        tempExit.put("W",2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);
        //tempExit.put("Q", 0);
        locationHashMap.put(1, new Location(1, "Location 1 Road",tempExit));

        tempExit = new HashMap<>();
        tempExit.put("N", 5);
        //tempExit.put("Q", 0);
        locationHashMap.put(2, new Location(2, "Location 2 Hill",tempExit));

        tempExit = new HashMap<>();
        tempExit.put("W", 1);
        //tempExit.put("Q", 0);
        locationHashMap.put(3, new Location(3, "Location 3 Building",tempExit));

        tempExit = new HashMap<>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);
        //tempExit.put("Q", 0);
        locationHashMap.put(4, new Location(4, "Location 4 Valley",tempExit));

        tempExit = new HashMap<>();
        tempExit.put("S", 1);
        tempExit.put("W", 2);
        // tempExit.put("Q", 0);
        locationHashMap.put(5, new Location(5, "Location 5 Forest",tempExit));


        Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("WEST", "W");
        vocabulary.put("EAST", "E");

        int loc = 1;
        while (true) {
            System.out.println(locationHashMap.get(loc).getDescription());
            if (loc == 0) {
                break;
            }

            tempExit.remove("S");

            Map<String, Integer> exits = locationHashMap.get(loc).getExits();


            System.out.println("Available exits are: ");
            for (String exit : exits.keySet()
            ) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();

            if (direction.length() > 1) {
                String[] words = direction.split(" ");
                for (String word : words
                ) {
                    if (vocabulary.containsKey(word)) {
                        direction = vocabulary.get(word);
                        break;
                    }
                }
            }

            if (exits.containsKey(direction)) {

                loc = exits.get(direction);

            } else {
                System.out.println("You cannot go in that direction");
            }

        }


    }
}
