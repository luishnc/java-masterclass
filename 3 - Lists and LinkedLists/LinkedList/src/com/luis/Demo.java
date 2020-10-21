package com.luis;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourn");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);

        addInOrder(placesToVisit, "Zum");
        printList(placesToVisit);
        addInOrder(placesToVisit, "Darwin");
        visit(placesToVisit);


    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting : " + i.next());
        }
        System.out.println("===============================");

    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                //eQual, do not add
                System.out.println(newCity + " is already included");
                return false;
            } else if (comparison > 0) {
                //new city should appear in alphabetical order
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;

            }
        }

        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> listIterator = cities.listIterator();
        if (cities.isEmpty()) {
            System.out.println("No cities in the itenerary");
            return;
        } else {
            System.out.println("Now visiting: " + listIterator.next());
            printMenu();
        }
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Holiday (Vacation) over");
                    quit = true;
                    break;

                case 1:
                    if(listIterator.hasNext()) {
                        System.out.println("Now visiting: " + listIterator.next());
                    }else {
                        System.out.println("End of the list");
                    }
                    break;

                case 2:
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting: " + listIterator.previous());

                    } else {
                        System.out.println("We are at the start of the list");
                    }


                case 3:
                    printMenu();
                    break;
            }

        }
    }

    private static void printMenu(){
        System.out.println("Available actions: \npress");
        System.out.println("0 - quit");
        System.out.println("1 - next city");
        System.out.println("2 previous city");
        System.out.println("3 - See the menu again");

    }


}
