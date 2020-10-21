package com.luis;

public class Main {

    public static void main(String[] args) {

//        Player p1 = new Player();
//        p1.fullName = "Luis";
//        p1.health = 100;
//        p1.weapon = "Sword";
//
//        int damage = 10;
//        p1.loseHealth(damage);
//        System.out.println("Remaining health: " + p1.healthRemaining());
//
//        p1.health = 200;
//        damage = 91;
//        p1.loseHealth(damage);
//        System.out.println("Remaining health: " + p1.healthRemaining());
        EnhancedPlayer player = new EnhancedPlayer("Luis",50,"Axe");
        System.out.println("Initial health is: " + player.getHealth());


    }
}
