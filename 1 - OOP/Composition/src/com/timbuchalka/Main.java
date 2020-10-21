package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
//	    Dimensions dimensions = new Dimensions(20, 20, 5);
//        Case theCase = new Case("2208", "Dell", "240", dimensions);
//
//        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
//
//        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
//
//        PC thePC = new PC(theCase, theMonitor, theMotherboard);
//        thePC.powerUp();
//
//        theCase.pressPowerButton();

        Table table = new Table("Brown",4);
        Television tv = new Television(false,"Samsung");
        LivingRoom livingRoom = new LivingRoom(10,2,table,tv);

        livingRoom.connectTv();
        System.out.println(livingRoom.getTelevision().isTurnedOn());

    }
}
