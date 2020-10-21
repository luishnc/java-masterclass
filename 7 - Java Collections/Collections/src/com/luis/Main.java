package com.luis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Theatre theatre = new Theatre("Luis's Theatre", 8, 12);
        if (theatre.reserveSeat("D12")) {
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Seat already reserved");

        }

        if (theatre.reserveSeat("B13")) {
            System.out.println("Please pay for B13");
        } else {
            System.out.println("Seat already reserved");

        }
        List<Theatre.Seat> reverseSeat = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseSeat);
        printList(reverseSeat);

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
//        priceSeats.add(theatre.new Seat("B00", 13.00));
//        priceSeats.add(theatre.new Seat("A00", 13.00));

        Collections.sort(priceSeats,Theatre.PRICE_ORDER);

        printList(priceSeats);



        //Just some code for testing collection Sort
//        Collections.shuffle(seatCopy);
//        System.out.println("Printing seatCopy");
//        printList(seatCopy);
//        System.out.println("Theatre.seat");
//        printList(theatre.seats);
//
//        Theatre.Seat minSeat = Collections.min(seatCopy);
//
//        Theatre.Seat maxSeat = Collections.max(seatCopy);
//
//        System.out.println("Min: " + minSeat.getSeatNumber());
//        System.out.println("Max: " + maxSeat.getSeatNumber());

        //theatre.getSeats();
//	if(theatre.reserveSeat("H11")){
//        System.out.println("Please pay");
//    } else {
//        System.out.println("Sorry, seat already reserved");
//    }
//
//        if(theatre.reserveSeat("H11")){
//            System.out.println("Please pay");
//        } else {
//            System.out.println("Sorry, seat already reserved");
//        }
//

//sortList(seatCopy);
//        System.out.println("Printing sorted seatCopy");
//        printList(seatCopy);
//
//        List<Theatre.Seat> newList = new ArrayList<>(theatre.seats.size());
//        //Collections.copy(newList,theatre.seats);

    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber() + " $" + seat.getPrice()) ;

        }
        System.out.println();
        System.out.println("======================================================================================");
    }

//    public static void sortList(List<? extends Theatre.Seat> list){
//        for (int i = 0; i < list.size() -1; i++) {
//            for (int j = i+1; j < list.size(); j++) {
//                if(list.get(i).compareTo(list.get(j)) > 0){
//                    Collections.swap(list,i,j);
//                }
//            }
//        }
//    }
}
